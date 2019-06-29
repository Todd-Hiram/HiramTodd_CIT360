package controller.Controller;

import controller.pojos.Response;
import java.util.HashMap;
import java.util.Map;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

/**
 * @author hiramtodd
 * 
 * This class contains a standard implementation of the application controller pattern.
 * In this application mapCommand method is private, handlers are added in the constructor of the controller, handlerRequest
 * method accepts objects of the Request class as an input, and handleRequesat methods returns objects of the Response class.
 */
public class AppController {
    
    private final Map<String, IHandler> handlers;

    // All handlers are created in the constructor.
    public AppController() {
        handlers = new HashMap<>();
        mapCommand("inputBudgetData", new InputDataHandler());
        mapCommand("reportBudget", new CalculateBudgetHandler());
    }
    
    private void mapCommand(String command, IHandler handler) {
        handlers.put(command, handler);
    }
    
    public Response handleRequest(Request request) {
        IHandler commandHandler = handlers.get(request.getCommand());
        if (commandHandler != null) {
            return commandHandler.handleIt(request.getData());
        } else {
            return null;
        }
    }
}
