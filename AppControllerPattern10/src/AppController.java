import handlers.AddBookHandler;
import handlers.DisplayBooksHandler;
import handlers.DisplayMenuHandler;

import java.util.HashMap;
import java.util.logging.Handler;

public class AppController {

    private HashMap<String, Handler> commands;

    public AppController() {
        commands = new HashMap<String, Handler>();
        commands.put("addBook", new AddBookHandler());
        commands.put("displayBooks", new DisplayBooksHandler());
        commands.put("displayMenu", new DisplayMenuHandler());
    }

    /**
     * The Application Controller Pattern is used to centralize retrieval and invocation when it comes to processing request
     * components like commands and views.
     *
     * We use HashMap in this application and is a table based operation of Java's Map interface and a Map is a collection of key-value pairs and it maps
     * keys to values. So, a map is implemented by the application controller in order to store different commands it knows
     * to use. The classes in this application hold the commands that will execute the Handler interfaces.
     * **/
    public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
        Handler command = commands.getOrDefault(commandKey, null);
        if (command == null) {
            throw new Exception("There is no command with the key word '" + commandKey + "'.");
        }

        return command.handleIt(commandData);
    }

}