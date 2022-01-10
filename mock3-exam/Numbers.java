public class Numbers implements Ok
{
    int[] nums;
    
    public static void main(){
        int[] x = {6,7,6,1,4};
        int[] y = {2,5,2,8,4};
        Numbers n = new Numbers(x);
        Numbers n2 = new Numbers(y);
        System.out.println(n.ok());
        System.out.println(n2.ok());
    }
    
    Numbers(int[] arr){
        this.nums = arr;
    }
    
    public boolean ok(){
        boolean evenOdd = true;
        for(int i=0; i<nums.length; i++){
            if(this.nums[i]%2 != i%2){
                evenOdd = false;
            }
        }
        
        return evenOdd;
    }
}
