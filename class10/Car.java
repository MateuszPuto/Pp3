public class Car extends Vehicle
{
    private User owner;
    private int passangers = 0, maxPassangers = 4;
    
    Car(String plate, char licence, int wheels, double weight, User owner){
        super(plate, licence, wheels, weight);
        this.owner = owner;
    }
    
    public boolean load(){
        if(this.getFreeSeats() > 0){
            passangers++;
            return true;
        }
        return false;
    }
    
    public int getFreeSeats(){
        return this.maxPassangers - this.passangers;
    }
}
