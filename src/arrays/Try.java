package arrays;

import java.util.Arrays;
import java.util.Random;

public class Try {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrays = new int[3][3];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(Integer.MAX_VALUE);
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        char[][] arrays2 = new char[9][9];
        for (int i = 0; i < arrays2.length; i++) {
            for (int j = 0; j < arrays2[i].length; j++) {
                if ((i == 0 || i == arrays2.length - 1) || (j == 0 || j == arrays2[i].length - 1)
                        || (i == arrays2.length / 2 && j == arrays2[i].length / 2)) {
                    arrays2[i][j] = '*';
                } else {
                    arrays2[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < arrays2.length; i++) {
            for (int j = 0; j < arrays2[i].length; j++) {
                System.out.print(arrays2[i][j]);
            }
            System.out.println();
        }

    }
}
