import java.util.ArrayList;

public class Bookcase
{
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public void main(){
        Book book1 = new Book("Title", new Writer("Author"));
        Book book2 = new Book("Title2", new Writer("Author2"));
        this.addBook(book1);
        this.addBook(book2);
        System.out.println(this);
        this.removeBook("Title2");
        System.out.println(this);
        
    }
    
    public void addBook(Book book){
        this.books.add(book);
    }
    
    public void removeBook(String bookName){
        int index = -1;
        for(int i=0; i<this.books.size(); i++){
            if(this.books.get(i).getTitle() == bookName){
                index = i;
            }
        }
        this.books.remove(index);
    }
    
    public String toString(){
        String s = "<Bookcase>\n";
        for(Book book: books){
            s += book.getTitle() + " by " + book.getAuthor() + "\n";
        }

        return s;
    }
}
