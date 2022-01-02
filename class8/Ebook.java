public class Ebook extends Book
{
    private String filename;
    
    Ebook(String title, Writer author, String filename){
        super(title, author);
        this.filename = filename;
    }
    
    String getFilename(){
        return this.filename;
    }
    void setFilename(String newFilename){
        this.filename = newFilename;
    }
    
    void display(char endchar){
        super.display(' ');
        System.out.println("Ebook file location: " + this.filename + endchar);
    }
}
