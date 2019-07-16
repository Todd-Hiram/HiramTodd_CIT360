package handlers;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.LogRecord;

import model.Book;
import model.Genre;
import model.Library;

public class AddBookHandler extends java.util.logging.Handler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        Scanner scanner = (Scanner) data.get("scanner");
        Library library = (Library) data.get("library");

        System.out.print("Enter an author: ");
        String author = scanner.nextLine();
        System.out.print("Enter a title: ");
        String title = scanner.nextLine();
        System.out.print("Enter a series name: ");
        String series = scanner.nextLine();
        System.out.println("Genres:");
        int i = 1;
        Genre[] genres = Genre.values();
        int genreSelection = 0;
        while (genreSelection < 1 || genreSelection > genres.length) {
            for (Genre genre : genres) {
                System.out.println(i++ + "-" + genre.toString());
            }
            System.out.print("Select a genre: ");
            genreSelection = GetNextInt(scanner);
            i = 1;
        }
        Genre selectedGenre = genres[genreSelection - 1];

        Book newBook = new Book(author, title, series, selectedGenre);
        library.addBook(newBook);
        return null;
    }

    private int GetNextInt(Scanner scanner) {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Please choose a genre from the list");
            return -1;
        }
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
