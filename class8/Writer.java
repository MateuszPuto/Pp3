public class Writer
{
    private String firstname;
    private String lastname;
    private String genre;
    
    Writer(String firstname, String lastname, String genre){
        this.firstname = firstname;
        this.lastname = lastname;
        this.genre = genre;
    }
    
    String getFirstname(){
        return this.firstname;
    }
    String getLastname(){
        return this.lastname;
    }
    String getGenre(){
        return this.genre;
    }
    
    public String toString(){
        return this.firstname + " " + this.lastname;
    }
}
