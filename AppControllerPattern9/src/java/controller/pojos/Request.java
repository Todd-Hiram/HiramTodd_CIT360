/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.pojos;

import java.util.Map;

/**
 *
 * @author hiramtodd
 */
public class Request {
    
    private String command;
    private Map<String, Object> data;

    public Request() {
        this.command = null;
        this.data = null;
    }

    public Request(String command, Map<String, Object> data) {
        this.command = command;
        this.data = data;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
    
}
