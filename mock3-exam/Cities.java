import java.util.ArrayList;

public class Cities
{
    private String[] arr;
    
    public static void main(){
        String[] arr = new String[] {"Warszawa","Sopot","Kielce","Szczecin"};
        Cities cty = new Cities(arr);
        System.out.println(cty.filter('S').cities());
    }
    
    Cities(String[] cities){
        this.arr = cities;
    }
    
    public Cities filter(char c){
        ArrayList<String> list = new ArrayList<String>();
        for(String city: this.arr){
            if(city.charAt(0) == c){
                list.add(city);
            }
        }
        String[] retList = new String[list.size()];
        Cities x = new Cities(list.toArray(retList));
        
        return x;
    }
    
    public String cities(){
        String text = "";
        for(String city: this.arr){
            text += city;
        }
        
        return text;
    }
}
