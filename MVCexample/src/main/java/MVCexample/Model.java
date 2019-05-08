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
    
    public void addTwoNum(int firstNum, int secondNum) {
        calValue = firstNum + secondNum;
    }
    
    public int getCalcValue() {
        return calValue;
    }
}