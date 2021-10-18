
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
   String title;
   String author;
   String ISBN;
   int noPages;
   float price;
   double discount;
   
   public void bookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Pages: " + noPages);
        System.out.println("Price and discount: " + price + " " + discount + "%");
    }
    
   public void changeDiscount(double newDiscount){
        discount = newDiscount;
    }
    
   public void readBook(){
        System.out.println("reading page 1 ...");
        System.out.println("reading page 2 ...");
        System.out.println(" [...] ");
        System.out.println("reading page " + noPages + " ...");
    }
}
