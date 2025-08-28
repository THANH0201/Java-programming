package Task5;
import Task4.BookRatingsReviews;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryStatistics {
    private ArrayList<BookRatingsReviews> books = new ArrayList<>();

    public void addBook(BookRatingsReviews book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Library Catalog:");
        int index = 1;
        for (BookRatingsReviews book : books) {
            System.out.printf("%d. %s\n", index++, book);
        }
    }

    public void findBooksByAuthor(String author) {
        for (BookRatingsReviews book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.printf("The books of Author \"%s\":\nTitle: %s, Year: %d", author, book.getTitle(), book.getYear());
            }
        }
        System.out.println("The book i not exist");
    }
    public void borrowBook(String title) {
        for (BookRatingsReviews book : books) {
            if (book.getTitle().equalsIgnoreCase(title.trim())) {
                books.remove(book);
                System.out.printf("Book %s have been borrowed successful\n", title);
                break;
            }
        }
        if (books.isEmpty()) {
            System.out.printf("Book %s is not exist\n", title);
        }
    }
    public void returnBook(BookRatingsReviews book) {
        books.add(book);
        System.out.printf("Book '%s' was added into System\n", book);
    }
    public void isBookAvailable(String checkTitle) {
        boolean hasCheckBook = books.stream().anyMatch(book -> book.getTitle().equalsIgnoreCase(checkTitle.trim()));
        System.out.printf("Book '%s' is available? %b\n", checkTitle, hasCheckBook);
    }
    public void getAverageBookRating(){
        double averageRating = books.stream().mapToDouble(BookRatingsReviews::getRating).average().orElse(0);
        System.out.printf("Average rating of system: %.2f\n ", averageRating);

    }
    public void getMostReviewedBook() {
        BookRatingsReviews mostReviewedBook = null;
        int maxReviews = 0;
        for (BookRatingsReviews book : books) {
            int reviewCount = book.getReview().size();
            if (reviewCount > maxReviews) {
                maxReviews = reviewCount;
                mostReviewedBook = book;
            }
        }
        if (mostReviewedBook != null) {
            System.out.printf("The most reviewed book: %s with %d reviews.\n",mostReviewedBook.getTitle(),  maxReviews);
        } else {
            System.out.println("No books found.");
        }
    }

    public static void main(String[] args) {
        LibraryStatistics mySystem = new LibraryStatistics();
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Add Book");
                System.out.println("2. Display Books");
                System.out.println("3. Find Book by Author");
                System.out.println("4. Borrow Book");
                System.out.println("5. Return Book-Review");
                System.out.println("6. Check Book Availability");
                System.out.println("9. Quit");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        BookRatingsReviews book1 = new BookRatingsReviews("Introduction to Java Programming", "John Smith", 2020);
                        BookRatingsReviews book2 = new BookRatingsReviews("Data Structures and Algorithms", "Jane Doe", 2018);
                        BookRatingsReviews book3 = new BookRatingsReviews("The Art of Fiction", "Alice Johnson", 2019);
                        mySystem.addBook(book1);
                        mySystem.addBook(book2);
                        mySystem.addBook(book3);
                        System.out.println("Book added successfully");
                        break;
                    /*    for (int i = 0; i < 3; i++) {
                            System.out.printf("Enter Book %d Title: ", i + 1);
                            String title = input.nextLine();
                            if (title.equalsIgnoreCase("ok")) {
                                break;
                            }
                            System.out.printf("Enter Book %d Author: ", i + 1);
                            String author1 = input.nextLine();
                            System.out.printf("Enter Book %d Public year: ", i + 1);
                            int year = Integer.parseInt(input.nextLine());
                            Book book = new Book(title, author1, year);
                            mySystem.addBook(book);
                            System.out.println("Book added successfully");
                            break;
                        }
                     */
                    case 2:
                        mySystem.displayBooks();
                        mySystem.getAverageBookRating();
                        mySystem.getMostReviewedBook();
                        break;

                    case 3:
                        System.out.println("Enter the Author:");
                        String author = input.nextLine();
                        mySystem.findBooksByAuthor(author);
                        break;

                    case 4:
                        System.out.println("Which book do you want to borrow?:");//The Art of Fiction
                        String borrowTitle = input.nextLine();
                        mySystem.borrowBook(borrowTitle);
                        break;
                    case 5:
                        System.out.println("Enter title, author,public year of the book that you want to return?:");//The Art of Fiction
                        String returnTitle = input.nextLine();
                        String returnAuthor = input.nextLine();
                        int returnYear = Integer.parseInt(input.nextLine());
                        BookRatingsReviews book = new BookRatingsReviews(returnTitle, returnAuthor, returnYear);
                        System.out.println("Please give review and rating about the book");
                        System.out.println("Write your review here:");
                        String review = input.nextLine();
                        book.setReview(review);
                        System.out.println("Give rating from 1 to 5:");
                        double rating = Double.parseDouble(input.nextLine());
                        book.setRating(rating);
                        mySystem.returnBook(book);
                        break;
                    case 6:
                        System.out.println("Which book do you want to check?:");
                        String checkTitle = input.nextLine();
                        mySystem.isBookAvailable(checkTitle);
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}





