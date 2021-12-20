public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume
{
    private boolean switchedOn = false;
    private int channelNo = 0;
    private int volume = 1;
    private String[] tvStations = new String[99];
    
    TV(){
        this.tvStations[0] = "TVN";
        this.tvStations[1] = "Polsat";
        this.tvStations[2] = "TVP 1";
        this.tvStations[3] = "TVP 2";
        this.tvStations[4] = "Puls";
        this.tvStations[5] = "TVN 24";
        this.tvStations[6] = "Polsat News";
        this.tvStations[7] = "TVP Kultura";
        this.tvStations[8] = "Paramount Channel";
        this.tvStations[9] = "Disney Channel";
        
    }
    
    public static void main(){
        TV tv = new TV();
        tv.on();
        tv.displayStatus();
        tv.channelUp();
        tv.setChannel(7);
        tv.setChannel(142);
        tv.displayStatus();
        tv.channelDown();
        tv.displayStatus();
        tv.off();
        tv.displayStatus();
        
        System.out.println();
        
        TV tv2 = new TV();
        tv2.on();
        tv2.displayStatus();
        tv2.setChannel(15);
        for(int i=0; i<6; i++){tv2.volumeUp();}
        tv2.displayStatus();
        tv2.off();
        tv2.displayStatus();
        
        TV tv3 = new TV();
        tv3.on();
        tv3.displayStations();
        tv3.displayStatus();
    }
    
    public void on(){
        this.switchedOn = true;
    }
    public void off(){
        this.switchedOn = false;
    }
    
    public void displayStatus(){
        if(this.switchedOn){
            System.out.print("TV is on. Channel " + this.tvStations[this.channelNo]);
            System.out.println(", Volume is " + this.volume);
        }
        else {
            System.out.println("TV is off.");
        }
    }
    
    public void displayStations(){
        for(int i=1; i<100; i++){
            if(this.tvStations[i-1] == null) break;
            System.out.println("Channel " + i + " : " + this.tvStations[i-1]);
        }
    }
    
    public void channelUp(){
        if(this.switchedOn && this.channelNo < 99){
            this.channelNo++;
        }
    }
    public void channelDown(){
        if(this.switchedOn && this.channelNo > 1){
            this.channelNo--;
        }
    }
    public void setChannel(int channel){
        if(this.switchedOn && channel >= 1 && channel <= 99){
            this.channelNo = channel;
        }
    }
    
    public void volumeUp(){
        if(this.switchedOn && this.volume < 10){this.volume++;}
    }
    public void volumeDown(){
        if(this.switchedOn && this.volume > 1){this.volume--;}
    }
}
