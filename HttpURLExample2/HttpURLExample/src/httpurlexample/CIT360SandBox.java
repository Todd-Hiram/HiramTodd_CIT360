/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlexample;

import java.awt.Menu;
import java.util.Scanner;

/**
 * This is the Welcome
 * @author hiramtodd
 */
public class CIT360SandBox {
    
    public static String firstName; 
    static Iterable<String[]> Selections; 
    public final static BackEndMenu Sql_Connect = new BackEndMenu(); 
    public final static Menu App = new Menu(); 

	public static void main(String[] args) throws Exception {
                
        Scanner input = new Scanner (System.in); 
        System.out.println("What is your name?");
        CIT360SandBox.firstName = input.next(); 
            
        System.out.println("Welcome " + firstName + "!");
            
        CIT360SandBox.App.mainMenu();

        }
    
}
