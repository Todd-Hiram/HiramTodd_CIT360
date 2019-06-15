/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hiramtodd
 */
public class RequestContext {
    
    private String requestUri;
    private Map < String, String[] > requestMap;
    private Map < String, Object > responseMap;
    
    public RequestContext() {
        
        requestUri = null;
        requestMap = new HashMap < String, String[] > ();
        responseMap = new HashMap < String, Object > ();
        
    }
    
    public RequestContext(String requestUri, Map < String, String[] > requestMap) {
        
        this.requestUri = requestUri;
        this.requestMap = requestMap;
        this.responseMap = new HashMap < String, Object > ();
        
    }
    
    public String getParameter(String param) {
        
        String[] val = null;
        if (param != null) {
            val = requestMap.get(param);
        }
        return val[0];
        
    }
    
    public void settribute(String param, Object value) {
        
        responseMap.put(param, value);
        
    }
    
    public String getRequestUri() {
        
        return requestUri;
        
    }
    
    public Map < String, String[] > getRequestMap() {
        
        return requestMap;
        
    }
    
    public Map < String, Object > getResponseMap() {
        return responseMap;
    }

    void setAttribute(String student, StudentVO studentVo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
