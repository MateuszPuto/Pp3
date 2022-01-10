import java.util.Arrays;

public class Product implements Comparable<Product>
{
    private String name;
    private float price;
    
    public static void main(){
        Product p = new Product("water", 5);
        Product p2 = new Product("milk", 2);
        Product p3 = new Product("ananas", 6);
        Product[] lst = {p, p2, p3};
        Arrays.sort(lst);
        System.out.println(lst[0].getName());
        System.out.println(lst[1].getName());
        System.out.println(lst[2].getName());
    }
    
    Product (String n, float p){
        this.name = n;
        this.price = p;
    }
    public String getName(){return name;}
    public float getPrice(){return price;}
    public int compareTo(Product other){
        return this.getName().compareTo(other.getName());
    }
}
