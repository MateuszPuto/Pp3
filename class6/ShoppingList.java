import java.util.ArrayList;

public class ShoppingList
{
    private ArrayList<String> items = new ArrayList<String>();
    
    public void addItem(String item){
        this.items.add(item);
    }
    
    public int numberOfItems(){
        return items.size();
    }
    
    public void displayList(){
        System.out.print("Shopping list: ");
        int ordering = 0;
        for(String item: items){
            ordering += 1;
            System.out.print(ordering + ". " + item + ", ");
        }
        System.out.println();
    }
}
