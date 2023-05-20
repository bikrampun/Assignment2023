import java.util.Timer;
import java.util.TimerTask;

class RepeatedConsole {
    public static void main(String[] args) throws InterruptedException
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Running: " + new java.util.Date());
            }
        }, 0, 1000*60*2); //displays a message in the console every 2 minutes
        // public void schedule(TimerTask task,long delay,long period)
        // time in milliseconds
    }
}