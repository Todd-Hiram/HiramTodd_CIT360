package org.techzoo.aqsa;

import static java.lang.String.format;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techzoo.aqsa.config.ControllerConfig;
import org.techzoo.aqsa.config.WebConfig;

final public class AqsaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String MAPPING_FILE = "mapping";
	
	private ServletContext context;
	private WebConfig webConfig = null;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.context = config.getServletContext();
		String mappingFile = null;
		String controllersProps = config.getInitParameter(MAPPING_FILE);
		mappingFile = context.getRealPath(controllersProps);
		webConfig = new WebConfig(mappingFile);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request,
			HttpServletResponse response) {
		final String servletPath = request.getServletPath();
		final String actionPath = servletPath.substring(1,servletPath.lastIndexOf("."));
		final Map<String, ControllerConfig> controllers = webConfig.getControllers();
		final ControllerConfig ctrConfig = controllers.get(actionPath);

		View view = null;
		if (ctrConfig != null) {
			String actionUrl = ctrConfig.getAction();
			if (actionPath.equals(actionUrl)) {
				try {
					final Controller controller = ctrConfig.invokeController();
					view = controller.execute(request, response);
					prepareModelData(request, view);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				dispatchRequestToView(view, webConfig, request, response);
			}
		} else
			throw new UnsupportedOperationException(format(
					"action %s is not found in mapping file.", actionPath)
				);
	}
	
	private void dispatchRequestToView(View view, WebConfig webConfig,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			String forward = view.getForward();
			final RequestDispatcher rd = context.getRequestDispatcher(forward);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void prepareModelData(HttpServletRequest request, View view) {
		final Map<String, ?> model = view.getModel();
		if (model != null) {
			for (Entry<String, ?> data : model.entrySet()) {
				request.setAttribute(data.getKey(), data.getValue());
			}
		}
	}
}