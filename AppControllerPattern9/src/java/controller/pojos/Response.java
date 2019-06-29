/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.pojos;

import java.util.Map;
import view.IView;

/**
 *
 * @author hiramtodd
 */
public class Response {
    
    private IView view;
    private Map<String, Object> data;

    public Response(IView view) {
        this.view = view;
    }

    public Response(IView view, Map<String, Object> data) {
        this.view = view;
        this.data = data;
    }
    
    public Response() {
        view = null;
        data = null;
    }

    public IView getView() {
        return view;
    }

    public void setView(IView view) {
        this.view = view;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
    
}
