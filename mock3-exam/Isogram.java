public class Isogram
{
    
    public static void main(){
        Isogram i = new Isogram();
        System.out.println(i.isogram("red sun"));
        System.out.println(i.isogram("blue water"));
        System.out.println(i.isogram("BLUE water"));
        System.out.println(i.isogram("my blue water"));
        System.out.println(i.isogram("tv set"));
        System.out.println(i.isogram("my tv set"));
    }
    
    public static boolean isogram(String text){
        boolean isIsogram = true;
        
        char[] alphabet = new char[200];
        for(int i=0; i<200; i++){
            alphabet[i] = 0;
        }
        
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            alphabet[(int) c]++;
        }
        
        for(int i=0; i<200; i++){
            if(alphabet[i] >= 2){
                isIsogram = false;
            }
        }
        
        return isIsogram;
    }
}
