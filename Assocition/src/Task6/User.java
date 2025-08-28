package Task6;
import java.util.*;

public class User {
    private String Name;
    private int age;
    private ArrayList<String> borrowBooks;

    public User(String name, int age) {
        this.Name = name;
        this.age = age;
        this.borrowBooks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("User[Name: %s, Age: %d]\n The books are holding: %s", Name, age, borrowBooks);
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }
    public void setBorrowBooks(String bookTitle) {
        borrowBooks.add(bookTitle);
    }
    public void removeBorrowedBook(String title) {
        borrowBooks.remove(title);
    }
    public ArrayList<String> getBorrowbooks() {
        return borrowBooks;
    }

}
