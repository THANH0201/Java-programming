package reserved.model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static int countBooks = 0;
    private boolean reservedBook = false;

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
    public void setAuthor(String author) {this.author = author;}
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public boolean isReserved() {
        return reservedBook;
    }
    public void setReserved(boolean reserved) {
        this.reservedBook = reserved;
    }

    @Override
    public String toString() {
        return String.format("%d books added.\n", countBooks);
    }
}
