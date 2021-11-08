public class Toothbrush
{
    String productNumber;
    int batteryLife;
    char operationMode;
    boolean isCharging;
    
    public Toothbrush(String number){
        this.productNumber = number;
        this.batteryLife = 49;
        this.operationMode = 'd';
        this.isCharging = false;
    }
    
    public void connectBattery(){
        this.isCharging = true;
    }
    public void dissconnectBattery(){
        this.isCharging = false;
    }
    public void batteryCharging(){
        if(this.isCharging == true){
            this.batteryLife += 1;
        }
    }
    public void changeMode(char mode){
        /* Modes of operation:
         * 'd' - disabled, 'w' - working, 'f' - fast mode, 's' - slow mode*/
        if(mode == 'd' || mode == 'w' || mode == 'f' || mode == 's'){
        this.operationMode = mode;
        }
    }
    public String getProductNumber(){
        return this.productNumber;
    }
    public String toString(){
        String s = "";
        s += "Battery: " + batteryLife + "%\n";
        s += "Mode: " + operationMode + "\n";
        s += "Is charging?: " + isCharging + "\n";
        return s;
    }
}
