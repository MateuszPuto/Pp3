public class Audiobook extends Book
{
    private int minutes, seconds;
    
    Audiobook(String title, Writer author, int minutesDuration, int secondsDuration){
        super(title, author);
        this.minutes = minutesDuration;
        this.seconds = secondsDuration;
    }
    
    int[] getDuration(){
        int[] duration = {this.minutes, this.seconds};
        return duration;
    }
    void setDuration(int newMinutes, int newSeconds){
        this.minutes = newMinutes;
        this.seconds = newSeconds;
    }
    
    void display(char endchar){
        super.display(' ');
        System.out.println("Audiobook duration is " + this.minutes + ":" + this.seconds + endchar);
    }
}
