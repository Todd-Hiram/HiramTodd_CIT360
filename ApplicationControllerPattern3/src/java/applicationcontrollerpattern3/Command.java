/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern3;

import org.springframework.web.servlet.support.RequestContext;

/**
 *
 * @author hiramtodd
 */
public interface Command {
    
    String execute(RequestContext requestContext);

    
}
