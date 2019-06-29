/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Map;
import controller.pojos.Request;
import controller.pojos.Response;

/**
 *
 * @author hiramtodd
 */
public class Router {
    
    public static void get(String command) {
        get(command, null);
    }
    
    public static void get(String command, Map<String, Object> data) {
        Request request = new Request(command, data);
        Response response = 
                AppControllerDemo.CONTROLLER.handleRequest(request);
        if (response != null) {
            response.getView().render(response.getData());
        }
    }
    
}
