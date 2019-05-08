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

/* The Controller, with the help of the Event Listeners,   */
    class CalculateListener implements ActionListener {
        
        public void actionPerformed(ActionEvent arg0) {
            int firstNum, secondNum = 0;
            try{
                firstNum = theView.getFirstNum();
                secondNum = theView.getSecondNum();
                
                theModel.addTwoNum(firstNum, secondNum);
                
                theView.setCalcTotal(theModel.getCalcValue());
            } catch(NumberFormatException ex) {
                theView.displayErrorMessage("Need to Enter two values!");
            }
        }
    }
}