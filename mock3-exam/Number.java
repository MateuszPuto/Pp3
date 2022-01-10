import java.lang.Math;

public class Number
{
   private int system;
   private String value;
   
   public static void main(){
        Number n = new Number(5, "101");
        Number n2 = new Number(8, "10283");
        
        System.out.println(n.get10());
        System.out.println(n2.get10());
    }
    
   Number(int sys, String val){
        this.setSystem(sys);
        this.setValue(val);
    }
   
   public int get10(){
        int exponent = 0;
        int number = 0;
        
        for(int i=value.length()-1; i>=0; i--){
            int digit = ((int) this.getValue().charAt(i)) - 48;
            if(digit >= this.getSystem()){
                return -1;
            }
            number += digit * Math.pow(getSystem(), exponent);
            exponent++;
        }
        
        return number;
    }
   
   public int getSystem(){
       return this.system;     
    }
   public void setSystem(int newSystem){
       this.system = newSystem; 
    }
   public String getValue(){
       return this.value;
    }
   public void setValue(String newValue){
        this.value = newValue;
    }
}
