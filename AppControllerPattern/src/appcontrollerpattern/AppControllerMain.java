/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrollerpattern;

import java.util.Scanner;

/**
 *
 * @author hiramtodd
 */
public class AppControllerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please type Peanuts, Creed, or Spectre to go to the appropriate Review.");
        AppController app = new AppController();
        app.dispatchRequest(input.next());
        
    }
    
}

// https://github.com/flamingcheeto5/CIT360-SandBox/tree/5a65496eede562362a16c58369733c8d68245f26/src/appcontroldemo