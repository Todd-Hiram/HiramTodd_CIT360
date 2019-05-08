/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCexample;


/**
 *
 * @author hiramtodd
 */
public class Model {
    private int calValue;
    
    public void multiplyTwoNum(int firstNum, int secondNum) {
        calValue = firstNum * secondNum;
    }
    
    /****************************************************************************
    * The Model of the MVC represents an object that contains data for an 
    * application. This part of the architecture handles the data and the business
    * logic for the program. When a user submits a question, the Contoller 
    * contacts the Model with the appropriate data and brings the data to the 
    * view of the user.
    *****************************************************************************/
    
    public int getCalcValue() {
        return calValue;
    }
}