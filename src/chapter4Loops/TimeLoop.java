package chapter4Loops;

public class TimeLoop {
    public static void main(String[] args) throws InterruptedException {
        /* for (int i = 10; i > 0; i--) {
            Thread.sleep(1000);
            System.out.print(i + "\r");
        }
         */

        int time = 7563; // time = 2 * 3600 = 7200, 7563 - 7200 = 453/60
        int hours;
        int minutes;
        int seconds;

        while (time > 0) {
            hours = time / 3600;
            minutes = time % 3600 / 60;
            seconds = time % 3600 % 60;

            System.out.print(((hours) < 10 ? "0" : "") + hours + ":"
                             + ((minutes) < 10 ? "0" : "") + minutes + ":"
                             + ((seconds) < 10 ? "0" : "") + seconds + "\r");
            Thread.sleep(1000);
            time--;

        }

    }
}
