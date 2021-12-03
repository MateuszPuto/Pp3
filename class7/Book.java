import java.util.ArrayList;

public class Book
{
    private String title;
    private Writer writer;
    private String bookNumber;
    private double price;
    private int pages;
    private ArrayList<Chapter> content = new ArrayList<Chapter>();
    
    Book(String title, Writer writer){
        this.writer = writer;
        this.title = title;
        writer.addBook(this);
    }
    
    public void setBookNumber(String number){
        this.bookNumber = number;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void addChapter(Chapter chapter){
        if(chapter.getStartingPage() == this.pages + 1){
            this.content.add(chapter);
            this.pages += chapter.getPageNumber();
        }
    }
    
    public String toString(){
        String s = "";
        s += "\nTitle: " + this.title;
        s += "\nWriter: " + this.writer.getName();
        s += "\nBook number: " + this.bookNumber;
        s += "\nPrice: " + this.price;
        s += "\nNumber of pages: " + this.pages;
        
        return s;
    }
    

    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.writer.getName();
    }
}
