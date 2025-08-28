package Task4;

import java.util.ArrayList;
import java.util.List;

public class BookRatingsReviews {
    private String title;
    private String author;
    private int year;
    private double rating;
    private List<String> reviews;

    public BookRatingsReviews(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0;
        this.reviews = new ArrayList<>();

    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setReview(String review) {
        reviews.add(review);
    }
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Year: %d, Reviews: %s, Rating: %.2f", title, author, year, reviews, rating);
    }
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getYear() {return year;}
    public double getRating() {return rating;}
    public List<String> getReview() {return reviews;}
}
