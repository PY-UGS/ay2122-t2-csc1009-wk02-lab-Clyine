
public class Question3 {
    public static void main(String[] args){
        long millis = System.currentTimeMillis();
        long TotalSec = millis/1000;
        long CurrentSec = TotalSec % 60;
        long TotalMin = TotalSec / 60;
        long CurrentMin = TotalMin % 60;
        long TotalHrs = TotalMin / 60;
        long CurrentHrs = TotalHrs % 24;
        System.out.println("Current time is " + CurrentHrs + ":" + CurrentMin + ":" + CurrentSec + " GMT");
    }
}

