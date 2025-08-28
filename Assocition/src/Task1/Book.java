package Task1;
import java.util.*;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Year: %d", title, author, year);
    }
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getYear() {return year;}

}
