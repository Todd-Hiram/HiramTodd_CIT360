/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppControllerPattern;

import static java.lang.Class.forName;
//import org.techzoo.aqsa.Controller;

/**
 *
 * @author hiramtodd
 */
public class ControllerConfig {
    
    private String action;
    private String controllerClass;
    
    public ControllerConfig(String action, String controllerClass) {
        
        super();
        this.action = action;
        this.controllerClass = controllerClass;
        
    }
    
    public Controller invokeController() {
        
        Controller controller = null;
        
        if (controllerClass != null && !controllerClass.isEmpty()) {
            
            try {
                
                controller = (Controller)forName(controllerClass).newInstance();
                
            } catch (Exception e) {
                
                e.printStackTrace();
                
            }
        }
        return controller;
    }
    
    public void setControllerClass(String controllerClass) {
        
        this.controllerClass = controllerClass;
        
    }
    
    public String getAction() {
        
        return action;
        
    }
    
    public String getControllerClass() {
        
        return controllerClass;
        
    }
    
}


// http://www.techzoo.org/java/lets-implement-j2ee-application-controller-design-pattern-today.html