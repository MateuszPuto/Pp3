import java.util.ArrayList;

public class Chapter
{
    private String title;
    private int startingPage;
    private int pages;
    private ArrayList<String> content = new ArrayList<String>();
    
    Chapter(String title, int startingPage){
        this.title = title;
        this.startingPage = startingPage;
        this.pages = 0;
    }
    
    public void addPage(String page){
        this.content.add(page);
        this.pages++;
    }
    
    public int getPageNumber(){
        return this.pages;
    }
    
    public int getStartingPage(){
        return this.startingPage;
    }
    
    public void printPage(int pageNum){
        System.out.println(content.get(pageNum - this.startingPage));
    }
}
