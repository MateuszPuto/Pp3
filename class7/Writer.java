import java.util.ArrayList;

public class Writer
{
    private String fullname;
    private String alias;
    private int yearsOfAge;
    private ArrayList<Book> books = new ArrayList<Book>();
    
    Writer(String fullname){
        this.fullname = fullname;
    }
    Writer(String name, String surname){
        this.fullname = name + " " + surname;
    }
    
    public void setAlias(String alias){
        this.alias = alias;
    }
    public void setAge(int age){
        this.yearsOfAge = age;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    
    public String toString(){
        String s = "";
        s += "\nFull name: " + this.fullname;
        s += "\nPseudonym: " + this.alias;
        s += "\n" + this.yearsOfAge + " years old.";
        s += "\nWritten " + this.books.size() + " books: ";
        for(Book book: this.books){
            s += "\n\t* " + book.getTitle();
        }
        
        return s;
    }
    
    public String getName(){
        return this.fullname;
    }
}
