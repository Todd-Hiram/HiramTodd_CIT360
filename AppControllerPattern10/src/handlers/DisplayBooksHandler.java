package handlers;

import model.Library;

import java.util.HashMap;
import java.util.logging.LogRecord;

public class DisplayBooksHandler extends java.util.logging.Handler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        Library library = (Library) data.get("library");

        String s = library.toString();
        System.out.println(s);
        return null;
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
}
