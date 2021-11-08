public class Product
{
   private String name;
   private boolean vegetarian;
   
   public Product(String name, boolean vegetarian){
        this.name = name;
        this.vegetarian = vegetarian;
    }
    
   public String getName(){
        return this.name;
    }
   public void setName(String name){
        this.name = name;
    }
   public boolean getIsVegetarian(){
        return this.vegetarian;
    }
   public void setIsVegetarian(boolean isVegetarian){
        this.vegetarian = isVegetarian;
    }
    
   public String toString(){
        return "Name: " + name + ", Is vegetarian?: " + vegetarian;
    } 
}
