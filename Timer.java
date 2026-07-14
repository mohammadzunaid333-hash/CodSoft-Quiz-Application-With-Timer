public class Timer extends Thread {

    private int seconds;
    private boolean timeUp = false;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            while (seconds > 0) {
                System.out.println("⏳ Time Left: " + seconds + " seconds");
                Thread.sleep(1000);
                seconds--;
            }

            timeUp = true;
            System.out.println("⏰ Time's Up!");

        } catch (InterruptedException e) {
            System.out.println("✅ Timer Stopped");
        }
    }

    public boolean isTimeUp() {
        return timeUp;
    }
}