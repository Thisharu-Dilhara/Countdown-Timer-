import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = 5;

            @Override
            public void run(){
                System.out.println(count);
                count--;

                if (count < 0){
                    System.out.println("HAPPY NEW YEAR!");

                }

            }
        };
        timer.schedule(task,0);



    }
}