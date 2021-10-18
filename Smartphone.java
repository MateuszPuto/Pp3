
/**
 * Write a description of class Smartphone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Smartphone
{
   float screenSize;
   float clockRate;
   int memorySize;
   String manufacturer;
   String color;
   
    public void printInfo(){
        System.out.println("screen: " + screenSize + "\"");    
        System.out.println("clock rate: " + clockRate + "GHz"); 
        System.out.println("memory size: " + memorySize + "GB");  
        System.out.println("manufacturer: " + manufacturer); 
        System.out.println("color: " + color);  
    }

    public void makeCall() {
        System.out.println("beep ... beep ... beep");
    }
    
    public void addMemory() {
        memorySize += 2;
    }
}
