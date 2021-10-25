public class InernetDevice
{
   String name;
   boolean connected;
   static int connectedDevices;
   
   InernetDevice(String name){
        this.name = name;
        connectedDevices += 1;
    }
   public void connect(){
        connected = true;
    }
   public void disconnect(){
        connected = false;
    }
   public boolean isConnected(){
        return connected;
    }
   public void displayStatus(){
       String status;
       if(connected){ 
           status = name + " is connected.";
        }
       else{
           status = name + " is disconnected.";
        }
    
       System.out.println(status);
    }
   public static void displayConnections(){
       System.out.println(connectedDevices);
    }
}
