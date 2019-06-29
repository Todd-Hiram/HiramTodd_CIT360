/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Map;

/**
 *
 * @author hiramtodd
 */
public interface IView {
    
    public void render(Map<String, Object> data);
    
}
