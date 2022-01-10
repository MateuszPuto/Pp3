public class Logic
{
    private boolean[] values;
    
    public static void main(){
        boolean[] a = {true,false,false};
        boolean[] b = {true, false, true, false};
        boolean[] c = {true, false, true, true, false, true, false, true, false};
        System.out.println(new Logic(a).opposite());
        System.out.println(new Logic(b).opposite());
        System.out.println(new Logic(c).opposite());
    }
    
    Logic(boolean[] values){
        this.values = values;
    }
    
    public int opposite(){
        int count = 0;
        
        for(int i=0; i<values.length; i++){
            if(i != 0 && i != values.length-1){

                if(values[i-1] != values[i]){
                    if(values[i+1] != values[i]){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
