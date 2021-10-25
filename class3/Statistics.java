public class Statistics{
  public static int itemsInRange(int low, int high){
        return high - low;
    }
  public static double sumInRange(int low, int high){
      int sum = 0;  
      for(int i=high; i>low; i--){
            sum += i;
        }
        
      return sum;
    }
  public static double meanOfRange(int low, int high){
        return sumInRange(low, high) / itemsInRange(low, high);
    }
}
