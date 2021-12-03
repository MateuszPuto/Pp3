import java.time.LocalDateTime;

public class File
{
    private String filename;
    private int size;
    private boolean accessRights;
    private LocalDateTime creationDateTime;
    private LocalDateTime modificationDateTime;
    private String fileContent;
    
    File(String name, String content, boolean rights){
        this.filename = name;
        this.size = content.length();
        this.accessRights = rights;
        this.creationDateTime = LocalDateTime.now();
        this.modificationDateTime = LocalDateTime.now();
        this.fileContent = content;
    }
    
    public String toString(){
        String str = "";
        str += "\nFilename: " + this.filename;
        str += "\nSize: " + this.size;
        str += "\nAccess rights: " + this.accessRights;
        str += "\nCreation date: " + this.creationDateTime;
        str += "\nModification date: " + this.modificationDateTime;
        
        return str;
    }
    
    public String getFile(){
        if(this.accessRights){
            return this.fileContent;
        }
        else{
            return "Access denied";
        }
        
    }
    
    public void changeFile(String newContent){
        this.modificationDateTime = LocalDateTime.now();
        if(this.accessRights){
            this.fileContent = newContent;
            this.size = newContent.length();
        }
    }
    
    public void setFilename(String newName){
        if(this.accessRights){
            this.filename = newName;
        }
    }
    
    public String getFilename(){
        return this.filename;
    }
    
    public int getSize(){
        return this.size;
    }
}
