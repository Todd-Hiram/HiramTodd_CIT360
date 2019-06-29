import model.Library;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AppController controller = new AppController();
        Scanner scanner = new Scanner(System.in);
        Library myLibrary = new Library();

        try {
            int action = -1;
            while (action != 0) {
                action = (int)controller.doCommand("displayMenu", GetCommandData("scanner", scanner));
                switch (action) {
                    case 1:
                        controller.doCommand("displayBooks", GetCommandData("library", myLibrary));
                        break;
                    case 2:
                        controller.doCommand("addBook", GetCommandData("scanner", scanner, "library", myLibrary));
                        break;
                    case 0:
                        System.out.println("Goodbye");
                        break;
                    default:
                        System.out.println("Unrecognized selection, please try again.");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }

    /**
     * Get an empty HashMap used as a data object for Application Controller Commands
     * @return Empty HashMap
     */
    public static HashMap<String, Object> GetCommandData() {
        HashMap<String, Object> data = new HashMap<>();
        return data;
    }

    /**
     * Get a HashMap containing one data object for Application Controller Commands
     * @param key Key for the data object
     * @param value data object
     * @return HashMap with one command
     */
    public static HashMap<String, Object> GetCommandData(String key, Object value) {
        HashMap<String, Object> data = GetCommandData();
        data.put(key, value);
        return data;
    }

    /**
     * Get a HashMap with a variable number of commands used as a data object for Application Controller Commands
     * @param objects Needs to alternate between a String key and an Object data
     * @return HashMap with a variable number of commands
     */
    public static HashMap<String, Object> GetCommandData(Object...objects) {
        HashMap<String, Object> data = GetCommandData();

        int i = 0;
        String key = "";
        while (i < objects.length) {
            var item = objects[i];
            if (i % 2 == 0) {
                key = (String)item;
            } else {
                data.put(key, item);
            }
            i++;
        }
        return data;
    }

}

// https://github.com/Lawrence-Brad/ApplicationControllerExample/tree/db44736b7a59b35c91fe07b2de69d4be475213eb/src/main