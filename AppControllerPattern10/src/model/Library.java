package model;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        String sanderson = "Brandon Sanderson";
        String stormlight = "The Stormlight Archive";
        String alcatraz = "Alcatraz";

        books.add(new Book(sanderson, "The Way of Kings", stormlight, Genre.FANTASY));
        books.add(new Book(sanderson, "The Words of Radiance", stormlight, Genre.FANTASY));
        books.add(new Book(sanderson, "Oathbringer", stormlight, Genre.FANTASY));

        books.add(new Book(sanderson, "Alcatraz Versus the Evil Librarians", alcatraz, Genre.YOUNG_ADULT));
        books.add(new Book(sanderson, "Alcatraz Versus the Scrivener's Bones", alcatraz, Genre.YOUNG_ADULT));
        books.add(new Book(sanderson, "Alcatraz Versus the Knights of Cystallia", alcatraz, Genre.YOUNG_ADULT));
        books.add(new Book(sanderson, "Alcatraz Versus the Shattered Lens", alcatraz, Genre.YOUNG_ADULT));
        books.add(new Book(sanderson, "The Dark Talent", alcatraz, Genre.YOUNG_ADULT));
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Library [books=\n\t");
        ArrayList<String> bookList = new ArrayList<>();
        for(Book book : books) {
            bookList.add(book.toString());
        }
        String bookStrings = String.join(",\n\t", bookList);
        builder.append(bookStrings);
        builder.append("\n]");
        return builder.toString();
    }

}
