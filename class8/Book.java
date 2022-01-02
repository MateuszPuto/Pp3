public class Book
{
    private String title;
    private Writer author;
    private Publisher publisher;
    private int yearOfPublication;
    
    Book(String title, Writer author){
        this.title = title;
        this.author = author;
    }
    
    String getTitle(){
        return this.title;
    }
    void setTitle(String newTitle){
        this.title = newTitle;
    }
    Writer getAuthor(){
        return this.author;
    }
    void setAuthor(Writer newAuthor){
        this.author = newAuthor;
    }
    Publisher getPublisher(){
        return this.publisher;
    }
    void setPublisher(Publisher newPublisher){
        this.publisher = newPublisher;
    }
    int getYearOfPublication(){
        return this.yearOfPublication;
    }
    void setYearOfPublication(int newYear){
        this.yearOfPublication = newYear;
    }
    
    void display(char endchar){
        System.out.println("Book: " + this.title + " by " + this.author);
        System.out.println("Published by " + this.publisher + endchar);
    }
}
