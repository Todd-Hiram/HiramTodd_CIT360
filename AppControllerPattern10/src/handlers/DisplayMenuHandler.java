package handlers;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.LogRecord;

public class DisplayMenuHandler extends java.util.logging.Handler implements Handler {

    public DisplayMenuHandler() {
    }

    @Override
    public void publish(LogRecord record) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        System.out.println("Menu:");
        System.out.println("\t1-Display Books");
        System.out.println("\t2-Add Book");
        System.out.println("\t0-Exit");
        System.out.print("Selection (1, 2, or 0): ");

        Scanner scanner = (Scanner)data.get("scanner");
        int selection = GetNextInt(scanner);
        return selection;
    }

    private int GetNextInt (Scanner scanner) {
        String input = scanner.nextLine();
        try {
            int result = Integer.parseInt(input);
            return result;
        } catch (Exception e) {
            System.out.println("You must enter a number from the menu.");
            return -1;
        }
    }
}
