public class Truck extends Vehicle
{
    private User owner;
    private double maxWeight;
    private double loadAmount = 1.0;
    
    Truck(String plate, char licence, int wheels, double weight, double maxWeight, User owner){
        super(plate, licence, wheels, weight);
        this.owner = owner;
        this.maxWeight = maxWeight;
    }
    
    public void setLoadAmount(double loadAmount){
        this.loadAmount = loadAmount;
    }
    public boolean load(){
        if(this.getFreeLoadSpace() > this.loadAmount){
            super.setWeight(super.getWeight() + this.loadAmount);
            return true;
        }
        return false;
    }
    
    public double getFreeLoadSpace(){
        return this.maxWeight - super.getWeight();
    }
}
