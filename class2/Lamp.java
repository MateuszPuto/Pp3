
/**
 * Write a description of class Lamp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lamp
{
    String lampName;    
    boolean isOn;
    
    public void SwitchOn(){
        isOn = true;
    }

    public void SwitchOff(){
        isOn = false;
    }
    
    public void printState(){
        System.out.println("Is lamp on: " + isOn);
    }
}

