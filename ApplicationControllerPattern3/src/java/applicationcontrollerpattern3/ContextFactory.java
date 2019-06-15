/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern3;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author hiramtodd
 */
public class ContextFactory {
    
    public RequestContext getContextObject(HttpServletRequest request) {
        
        Map < String, String[] > requestMap = null;
        RequestContext requestContext = null;
        HttpRequestMapper requestMapper = null;

        requestMapper = new HttpRequestMapper();
        requestMap = requestMapper.extract(request);
        requestContext = new RequestContext(request.getRequestURI(), requestMap);

        return requestContext;
    }

    public void bindContextObject(HttpServletRequest request, RequestContext requestContext) {
        
        HttpRequestMapper requestMapper = null;

        requestMapper = new HttpRequestMapper();
        requestMapper.bind(request, requestContext.getResponseMap());
        
    }
    
}
