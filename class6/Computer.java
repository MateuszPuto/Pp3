public class Computer
{
    private String name;
    private int coreNumber;
    private double clockSpeed;
    private int mainMemorySize;
    private int baseMemorySize;
    private boolean hasGraphicsCard;
    private String graphicsCard;
    private boolean internetConnection;
    
    public Computer(String name){
        this.name = name;
    }
    
    public void setProcessor(int cores, double clockSpeed){
        this.coreNumber = cores;
        this.clockSpeed = clockSpeed;
    }
    
    public void setMemory(int mainMemorySize, int baseMemorySize){
        this.mainMemorySize = mainMemorySize;
        this.baseMemorySize = baseMemorySize;
    }
    
    public void setGraphicsCard(String graphicsCard){
        this.hasGraphicsCard = true;
        this.graphicsCard = graphicsCard;
    }
    
    public void setInternetConnection(boolean internetConnection){
        this.internetConnection = internetConnection;
    }
    
    public void printInfo(){
        System.out.println("----------");
        System.out.println("Computer: " + this.name);
        System.out.println("Processor cores: " + this.coreNumber + " Clock rate: " + this.clockSpeed);
        System.out.println("Main memory: " + this.mainMemorySize + " Base memory: " + this.baseMemorySize);
        if(this.hasGraphicsCard){
            System.out.println("Graphics card: " + this.graphicsCard);
        }
        System.out.println("Internet connection: " + this.internetConnection);
        System.out.println("----------");
    }
    
    public void ping(String address, int times){
        if(this.internetConnection){
            for(int i=0; i<times; i++){
                System.out.println("Pinged " + address);
            }
        }
        else{
            System.out.println("No internet connection!");
        }
    }
    
}
