public abstract class Food
{
    private String name;
    private float price;
    
    Food(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public float getPrice(){
        return this.price;
    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }
    public abstract void setPrice();
}
