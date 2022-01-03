public abstract class Vehicle
{
    private String plateNumber;
    private char licenceType;
    private int numberOfWheels;
    private double weight;
    
    Vehicle(String plate, char licence, int wheels, double weight){
        this.setPlate(plate);
        this.setLicence(licence);
        this.setWheels(wheels);
        this.setWeight(weight);
    }
    
    public abstract boolean load();
    
    public String getPlate(){
        return this.plateNumber;
    }
    public void setPlate(String newPlateNumber){
        this.plateNumber = newPlateNumber;
    }
    public char getLicence(){
        return this.licenceType;
    }
    public void setLicence(char newLicenceType){
        this.licenceType = newLicenceType;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public int getWheels(){
        return this.numberOfWheels;
    }
    public void setWheels(int wheels){
        this.numberOfWheels = wheels;
    }
    public void printInfo(){
        System.out.println("Plate number: " + this.plateNumber);
        System.out.println("Required licence: " + this.licenceType);
        System.out.println("Number of wheels: " + this.numberOfWheels + " and weight: " + this.weight);
    }
}
