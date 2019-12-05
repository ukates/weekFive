/*

   Derrick Cates
   Bellevue University
   CIS 402A-305J
   December 1, 2019

   The purpose of this assignment is to create a class called SchoolTextBook.
   The class should have author, title, page count, isbn, and price. with
   getters and setters for each.  Should also create a class called
   SchoolTextBookSort with a main method that takes user input to determine
   how to sort an array of SchoolTextBook objects.

*/
//import df for usd formatting
import java.text.DecimalFormat;
//class SchoolTextBook
public class SchoolTextBook {
    //variables for class
    private String author;
    private String title;
    private int pageCount;
    private String isbn;
    private double price;
    //getters and setters for each variable in the class
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPageCount() {
        return this.pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    //override to display objects in the form of a string
    public String toString() {
        //df object created to format price
        DecimalFormat df = new DecimalFormat("$###,###.##");
        //return string of an object.
        return "\nTextbook Information\nTitle : " + title + "\nAuthor: " + author +
                "\nISBN  : " + isbn + "\nPages : " + pageCount + "\nPrice : " +
                df.format(price) + "\n";
    }
}
