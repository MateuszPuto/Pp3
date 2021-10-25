
/**
 * Write a description of class Counter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Counter
{
   int value;
   
   public void resetCounter(){
        value = 0;
    }
    
   public void increment(){
        value += 1;
    }
    
   public void decrement(){
        value -= 1;
    }
    
   public void incBy10(){
        value += 10;
    }
    
   public void decBy10(){
        value -= 10;
    }
}
