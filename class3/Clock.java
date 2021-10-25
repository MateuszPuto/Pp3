public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock(){
        hour = 0;
        minute = 0;
    }
    Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
        public void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public void setClock(){
        hour = 0;
        minute = 0;
    }
    public void displayTime(){
        System.out.printf("%02d:%02d\n", hour, minute);
    }
    public void addOneMinute(){
        if(minute == 59){
            hour += 1;
            minute = 0;
        }
        else {
            minute += 1;
        }
        
        if(hour == alarmHour && minute == alarmMinute){
            runAlarm();
        }
    }
    public void setAlarm(int hour, int minute){
        alarmHour = hour;
        alarmMinute = minute;
    }
    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
}
