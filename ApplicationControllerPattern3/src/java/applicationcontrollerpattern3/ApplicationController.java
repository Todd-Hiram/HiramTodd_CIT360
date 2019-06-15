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
public class ApplicationController {

    public String process(RequestContext requestContext) {
        String view = null;
        Command command = null;
        CommandHelper commandHelper = null;

        commandHelper = new CommandHelper();
        command = commandHelper.getCommand(requestContext.getRequestUri());
        view = command.execute(requestContext);

        return view;
    }

    public String mapViewToPage(String view) {
        String page = null;
        if (view != null) {
            page = "viewStudent.jsp";
        }

        return page;
    }
}

public class CommandHelper {

    public Command getCommand(String uri) {

        Command command = null;
        if (uri.contains("studentView.do")) {
            command = new StudentViewCommand();
        }

        return command;
    }

}
