package library.model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static int countBooks = 0;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        countBooks++;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {

    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    @Override
    public String toString() {
        return String.format("%d books added.\n", countBooks);
    }
}
