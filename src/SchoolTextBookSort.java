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
//import Arrays class and comparator to sort arrays
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//class for sorting textbook objects
public class SchoolTextBookSort {
    //main method
    public static void main(String[] args) {
        //create array of school textbook objects 5 in total
        SchoolTextBook[] books = new SchoolTextBook[5];
        //assign textbook objects to schooltextbook array
        Arrays.setAll(books, x -> new SchoolTextBook());
        //set book information
        books[0].setIsbn("7480553082579");
        books[0].setAuthor("Charles Charlesington");
        books[0].setTitle("Intro to Introductions");
        books[0].setPageCount(947);
        books[0].setPrice(128.25);
        //set book information
        books[1].setIsbn("2623189658614");
        books[1].setAuthor("Madelief Fflur");
        books[1].setTitle("Intermediate Intro to Introductions");
        books[1].setPageCount(1124);
        books[1].setPrice(250.99);
        //set book information
        books[2].setIsbn("6998571678864");
        books[2].setAuthor("Dardana Waltraud");
        books[2].setTitle("Advanced Introduction to Introductions");
        books[2].setPageCount(516);
        books[2].setPrice(123.69);
        //set book information
        books[3].setIsbn("4885903579811");
        books[3].setAuthor("Daragh Cerdic");
        books[3].setTitle("The Analytics of Introductory Courses");
        books[3].setPageCount(667);
        books[3].setPrice(321.32);
        //set book information
        books[4].setIsbn("2015399746804");
        books[4].setAuthor("Barb Rodolph");
        books[4].setTitle("Price Gouging for Dummies");
        books[4].setPageCount(270);
        books[4].setPrice(519.99);
        //variable for continuing loop
        String ch;
        //do while loop
        do {
            //take user input ... display options
            Scanner input = new Scanner(System.in);
            System.out.println("We have five different textbooks stored in our system");
            System.out.println("\nHow would you like to sort the books for viewing?");
            System.out.println("\nBy Title      = press 1" +
                "\nBy Author     = press 2" +
                "\nBy ISBN       = press 3" +
                "\nBy Page Count = press 4" +
                "\nBy Price      = press 5");
            //assign user input to choice variable
            int choice = input.nextInt();
            //swithc statement for choice
            switch (choice) {
                //if case one use arrays.sort and comparator to compare and resort for option selected
                case 1:
                    Arrays.sort(books, Comparator.comparing(SchoolTextBook::getTitle));
                    System.out.print(Arrays.toString(books));
                    break;
                case 2:
                    Arrays.sort(books, Comparator.comparing(SchoolTextBook::getAuthor));
                    System.out.print(Arrays.toString(books));
                    break;
                case 3:
                    Arrays.sort(books, Comparator.comparing(SchoolTextBook::getIsbn));
                    System.out.print(Arrays.toString(books));
                    break;
                case 4:
                    Arrays.sort(books, Comparator.comparing(SchoolTextBook::getPageCount));
                    System.out.print(Arrays.toString(books));
                    break;
                case 5:
                    Arrays.sort(books, Comparator.comparing(SchoolTextBook::getPrice));
                    System.out.print(Arrays.toString(books));
                    break;
                //default if choice not what is available
                default:
                    System.out.print("This was not a valid choice, try again.");
            }
            //ask if user would like to sort again
            System.out.print("\n\nPress y to try again: ");
            //take input as ch
            ch = input.next();

        }
        //continue while ch is equal to Y while ignoring case
        while (ch.equalsIgnoreCase("Y"));
        //thank user for sorting if not selecting Y to continue.
        System.out.print("Thanks for sorting!");
    }
}
