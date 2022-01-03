public class Bus extends Vehicle
{
    private User owner;
    private int passangers = 0, maxPassangers = 50;
    
    Bus(String plate, char licence, int wheels, double weight, User owner){
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
