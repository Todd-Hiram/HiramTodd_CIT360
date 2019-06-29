package appcontrollerdemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hiramtodd
 */
public class AppControllerDemo {
    
    /**
     * Holds a reference to the application controller object
     */
    public static final ApplicationController CONTROLLER = new ApplicationController();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Router.get("inputBudgetData");
    }
    
}
