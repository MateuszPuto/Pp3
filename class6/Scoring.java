import java.util.Arrays;

public class Scoring
{
    private int[] scores = {-1, -1, -1, -1, -1};
    private String[] judgeNames;
    
    public Scoring(String[] names){
        judgeNames = names;
    }
    
    public void printJudges(){
        for(String judgeName: judgeNames){
            System.out.println("Judge " + judgeName);
        }
    }
    
    public boolean setScore(String name, int score){
        for(int i=0; i<judgeNames.length; i++){
            if(name == judgeNames[i] && score>0 && score<6){
                scores[i] = score;
                return true;
            }
        }
        return false;
    }
    
    public void printCurrentScore(){
        for(int score: scores){
            System.out.print(score + ", ");
        }
        System.out.println();
    }
    
    public double getFinalScore(){
        for(int i=0; i<scores.length; i++){
            if(scores[i] == -1){
                return -1.0;
            }
        }
        
        Arrays.sort(scores);
        int counter=0;
        for(int i=1; i<scores.length-1; i++){
            counter += scores[i];
        }
        return 1.0 * counter / (scores.length - 2);
    }
}
