package chapter4Loops;

import java.util.Random;

public class RollGameLoop {
    public static void main(String[] args) {

        int playField = 20;
        int roll = 5;
        Random random = new Random();

        int total = 0;

        for (int i = 0; i < roll; i++) {
            int die = random.nextInt(6) + 1;
            total = total + die;
            int rest = playField - total;
            System.out.println("You've rolled a " + die + ". You are now on space " + total + " and have " + rest + " more to go.");
            if (total > playField) {
                System.out.println("You lose( " + total);
                break;
            } else if (total == playField) {
                System.out.println("You win!! Congrats!! " + total);
                break;
            }

        }
        if (total < playField) {
            System.out.println("You lose(, you are now on space " + total);
        }

    }
}
