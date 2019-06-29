/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Controller;

import java.util.Map;
import controller.pojos.Response;
import view.InputDataView;

/**
 *
 * @author hiramtodd
 */
public class InputDataHandler extends IHandler {
    
    @Override
    public Response handleIt(Map<String, Object> data) {
        Response response = new Response(new InputDataView());
        return response;
    }
    
}
