/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCexample;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hiramtodd
 */
public class View extends JFrame {
    private JTextField firstNum = new JTextField(10);
    private JLabel addLabel = new JLabel("+");
    private JTextField secondNum = new JTextField(10);
    private JButton calcButton = new JButton("Calculate");
    private JTextField calcTotal = new JTextField(10);
    
    View(){
        JPanel  calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        
        calcPanel.add(firstNum);
        calcPanel.add(addLabel);
        calcPanel.add(secondNum);
        calcPanel.add(calcButton);
        calcPanel.add(calcTotal);
        
        this.add(calcPanel);
    }
    
    public int getFirstNum() {
        return Integer.parseInt(firstNum.getText());
    }
    
    public int getSecondNum() {
        return Integer.parseInt(secondNum.getText());
    }
    
    public int getCalcTotal() {
        return Integer.parseInt(calcTotal.getText());
    }
    
    public void setCalcTotal(int solution) {
        calcTotal.setText(Integer.toString(solution));
    }
    
    void addCalculateListener(ActionListener listenerForCalcButton) {
        calcButton.addActionListener(listenerForCalcButton);
    }
    
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}