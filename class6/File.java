import java.time.LocalDate;

public class File
{
    private String name;
    private int size;
    private String diskLocation;
    private boolean accessRights;
    private LocalDate accessDate;
    private LocalDate creationDate;
    
    public File(String name){
        this.name = name;
        this.diskLocation = "C:\\";
        this.creationDate = LocalDate.now();
    }
    
    public File(String name, int size, String diskLocation){
        this.name = name;
        this.size = size;
        this.diskLocation = diskLocation;
        this.creationDate = LocalDate.now();
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAccessRights(boolean accessiable){
        this.accessRights = accessiable;
    }
    
    public void setDiskLocation(String location){
        this.diskLocation = location;
    }
    
    public void printInfo(){
        System.out.println("-----------------------");
        System.out.println("File name: " + this.name);
        System.out.println("File size: " + this.size);
        System.out.println("Location: " + this.diskLocation);
        System.out.println("Access rights: " + this.accessRights);
        System.out.println("Last access and creation dates: " + this.accessDate + " " + this.creationDate);
        System.out.println("-----------------------");
    }
    
    public String getFile(){
            this.accessDate = LocalDate.now();
            if(this.accessRights == true){
                return this.diskLocation;
            }
            else{
                return "";
            }
    }
}
