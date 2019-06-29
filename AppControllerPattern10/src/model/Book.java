package model;

public class Book {

    private String author;
    private String title;
    private String series;
    private Genre genre;

    public Book(String author, String title, String series, Genre genre) {
        this.author = author;
        this.title = title;
        this.series = series;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", series=" + series + ", genre=" + genre.toString() + "]";
    }

}
