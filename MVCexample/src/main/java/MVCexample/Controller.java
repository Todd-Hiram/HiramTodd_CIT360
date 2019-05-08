/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *
 * @author hiramtodd
 */
public class Controller {
    private View theView;
    private Model theModel;
    
    public Controller(View theView, Model theModel){
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculateListener(new CalculateListener());
    }

    /****************************************************************************
    * The Controller, with the help of the Event Listeners, processes the user's 
    * request and passes the data between the Model, which contains the
    * data of the application, and the View, which displays the information to the 
    * user who is requesting whatever formation the application is programmed to 
    * display. In short, the Controller controls the data flow of the 
    * application's Model and updates the View when the data changes.
    *****************************************************************************/
    
    class CalculateListener implements ActionListener {
        
        public void actionPerformed(ActionEvent arg0) {
            int firstNum, secondNum = 0;
            try{
                firstNum = theView.getFirstNum();
                secondNum = theView.getSecondNum();
                
                theModel.multiplyTwoNum(firstNum, secondNum);
                
                theView.setCalcTotal(theModel.getCalcValue());
            } catch(NumberFormatException ex) {
                theView.displayErrorMessage("Need to Enter at least two values for the program to work!");
            }
        }
    }
}