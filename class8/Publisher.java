public class Publisher
{
    private String name;
    private String city;
    
    Publisher(String name, String city){
        this.name = name;
        this.city = city;
    }
    
    String getName(){
        return this.name;
    }
    void setName(String newName){
        this.name = newName;
    }
    String getCity(){
        return this.city;
    }
    void setCity(String newCity){
        this.city = newCity;
    }
}
