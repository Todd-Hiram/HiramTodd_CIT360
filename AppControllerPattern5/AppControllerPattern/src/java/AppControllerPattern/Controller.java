/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppControllerPattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

/**
 *
 * @author hiramtodd
 */
public interface Controller {
    
    public View execute (HttpServletRequest request, 
            HttpServletResponse response) throws Exception;
    
}
