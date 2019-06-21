/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlexample;

import java.awt.Menu;
import java.util.Scanner;

/**
 * This example is of a request from Java to pull an HTTP page for whatever reason such as pulling data off the page, or
 * myabe also pull the data from off the database that is connected to that web page. In this case, this is a request to a
 * Marvel site that no longer is online.
 *
 * @author hiramtodd
 */
public class HttpURLExample {

    /**
     * @param args the command line arguments
     */
    
    public final static BackEndMenu BackEndMenu = new BackEndMenu();

    
public final static String [][] Selection = {
        {"C", "HTTP Connection Test"},
        {"I", "I/O SMTP example"},
        {"M", "Show Movie Times"},
        {"L", "Movie Theatre List"},
        {"P", "Movie Ticket Prices"},
        {"X", "Exit Program"}
    };      
    public final static void mainMenu() throws Exception{

        String command;
        Scanner inFile = new Scanner(System.in);
        
        do{
            CIT360SandBox.App.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase(); //changes input to always be uppercase, in case someone inputs a lowercase letter. 
                
                switch (command){
                                    
                   case "C":
                   CIT360SandBox.Sql_Connect.urltest(); 
                   break; 
                       
                   case "I":
                   CIT360SandBox.Sql_Connect.smtpExample();
                   break; 
                       
                   case "M":
                   CIT360SandBox.Sql_Connect.connect(); 
                   break;      
                       
                   case "L": 
                    CIT360SandBox.Sql_Connect.purchaseTicketsCompanyList();
                    break;
                    
                case "P": 
                    CIT360SandBox.Sql_Connect.ticketPrices();
                    break;    
                
                case "X":  //breaks from the options menu. 
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");  //pints out an error when one of the above listed options is not selected. 
                    }
                }
                
            while (!command.equals("X")); //continues to run the main menu until X is selected to end it. 
    }
    
    
    public final void display (){
        System.out.println("\n\t************************************************************"); //decoration. 
        System.out.println("\tEnter the letter for your selection from the main menu:"); //simple output message. 
        for (String[] mainMenuItem : Menu.Selection) {
            System.out.println("\t  " + mainMenuItem[0] + "\t" + mainMenuItem[1]);
        }
        System.out.println("\t************************************************************\n");
    }
        
    }

