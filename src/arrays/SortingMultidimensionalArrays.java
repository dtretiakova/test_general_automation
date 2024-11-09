package arrays;

import java.util.Arrays;
import java.util.Random;

public class SortingMultidimensionalArrays {
    public static void main(String[] args) {
        int[][] array3 = new int[5][100];
        Random random = new Random();

        //перші цикли для рандомного заповнення масивів
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = random.nextInt(1, 100);
            }
        }

        //цикл для виводу результатів після рандому, до сортування
        for (int i = 0; i < array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }



        //цикл для сортування (цикл обертка елементами якого являються інші масиви)
        for (int mainIndex = 0; mainIndex < array3.length; mainIndex++) {
            //цикл для обходу елементів конкретного масиву
            for (int i = 0; i < array3[mainIndex].length; i++) {
                boolean exit = true;
                for (int j = 0; j < array3[mainIndex].length - 1 - i; j++) {
                    if (array3[mainIndex][j] > array3[mainIndex][j + 1]) {
                        int temp = array3[mainIndex][j];
                        array3[mainIndex][j] = array3[mainIndex][j + 1];
                        array3[mainIndex][j + 1] = temp;
                        exit = false;
                    }
                }
                if (exit) {
                    break;
                }
            }
        }

        //цикл для виводу результатів після сортування
        for (int i = 0; i < array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }
    }
}




