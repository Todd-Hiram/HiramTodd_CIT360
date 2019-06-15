/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern3;

/**
 *
 * @author hiramtodd
 */
public class CommandHelper {
    public Command getCommand(String uri) {
        
        Command command = null;
        if (uri.contains("studentView.do")) {
            command = new StudentViewCommand();
        }
        
        return command;
    }
}
