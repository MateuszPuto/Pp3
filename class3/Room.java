public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number){
        this.number = number;
        this.beds = 2;
    }
    
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    public void checkin(String guestName){
        this.guestName = guestName;
        this.occupied= true;
    }
    public void checkout(){
        this.occupied = false;
    }
    public boolean isOccupied(){
        return occupied;
    }
    public String toString(){
        String s = "";
        s += "Number: " + number;
        s += "\nBeds: " + beds;
        s += "\nIs occupied?: " + occupied;
        s += "\nGuest name: " + guestName + "\n";
        
        return s;
    }
}
