/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.cglib.proxy.Dispatcher;

/**
 *
 * @author hiramtodd
 */
public class FrontController extends HttpServlet {
    
    private static final long serialVersionUID = 1 L;
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String page = null;
        String view = null;
        Dispatcher dispatcher = null;
        RequestContext requestContext = null;
        ContextFactory contextFactory = null;
        ApplicationController applicationController = null;
        
        // Extracting data from protocol
        contextFactory = new ContextFactory();
        requestContext = contextFactory.getContextObject(request);
        
        applicationController = new ApplicationController();
        view = applicationController.process(requestContext);
        
        // Binding data back to protocol
        contextFactory.bindContextObject(request, requestContext);
        page = applicationController.mapViewToPage(view);
        
        dispatcher = new Dispatcher();
        dispatcher.dispatch(request, response, page);
        
    }
}
