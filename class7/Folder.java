import java.util.ArrayList;
import java.time.LocalDateTime;

public class Folder
{
    private String folderName;
    private int folderSize;
    private ArrayList<File> files = new ArrayList<File>();
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    
    public static void main(){
        Folder myFolder = new Folder("myfolder1");
        File file1 = new File("file", "abc", true);
        File file2 = new File("file02", "ghj", true);
        myFolder.addFile(file1);
        myFolder.addFile(file2);
        System.out.println(myFolder);
        File file3 = new File("third-file", "xyz", true);
        myFolder.addFile(file3);
        System.out.println(myFolder);
        myFolder.removeFile("file02");
        System.out.println(myFolder);
    }
    
    Folder(String name){
        this.folderName = name;
        this.folderSize = 0;
        this.creationDate = LocalDateTime.now();
        this.modificationDate = LocalDateTime.now();
    }
    
    Folder(String name, File[] files){
        this.folderName = name;
        this.folderSize = 0;
        this.creationDate = LocalDateTime.now();
        this.modificationDate = LocalDateTime.now();
        
        for(int i=0; i<files.length; i++){
            this.files.add(files[i]);
        }
    }
    
    public void addFile(File file){
        this.modificationDate = LocalDateTime.now();
        this.files.add(file);
        this.folderSize += file.getSize();
    }
    
    public void removeFile(String filename){
        this.modificationDate = LocalDateTime.now();
        
        int index = -1; 
        for(int i=0; i<this.files.size(); i++){
            if(this.files.get(i).getFilename() == filename){
                index = i;
            }
        }
        this.folderSize -= files.get(index).getSize();
        this.files.remove(index);
    }
    
    public String toString(){
        String str = "";
        str += "\nFolder name: " + this.folderName;
        str += "\nFolder size: " + this.folderSize;
        str += "\nCreation date: " + this.creationDate;
        str += "\nModification date: " + this.modificationDate;
        str += "\n[ ";
        for(File file: this.files){
            str += file.getFilename() + " ";
        }
        str += "]";
        
        return str;
    }
}
