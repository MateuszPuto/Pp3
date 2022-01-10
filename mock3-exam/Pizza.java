public class Pizza extends Food implements Extra
{
    private int size;
    
    Pizza(String name, int s){
        super(name);
        this.size = s;
    }
    
    public void setPrice(){
        super.setPrice(this.size - 10);
    }
    public float discount(){
        if(super.getPrice() >= 30){
            return 0.05f * super.getPrice();
        }
        return 0.00f;
    }
    public float delivery(){
        int cost = 6;
        if(this.size >= 50){
            cost = 8;
        }
        
        return cost;
    }
    public float delivery(int tip){
        return this.delivery() + tip;
    }
}
