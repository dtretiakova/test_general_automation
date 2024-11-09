package arrays;

import java.util.Arrays;
import java.util.Random;
// лотарея крутим барабан 100 шариков и достаем 5 шариков виигршних не полвторяющиеся
public class LotteryArrays {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] winArr = new int[5];
        //int winIndex = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < 5; i++) {
            int randomNumber = (int) (Math.random() * (array.length - i));
            System.out.println("Iteration:" + i);
            System.out.println("Rnd:" + randomNumber);
            System.out.println(Arrays.toString(array));
            int temp = array[randomNumber];
            array[randomNumber] =array[array.length -1 -i];
            array[array.length -1 -i] = temp;
            System.out.println(Arrays.toString(array));

        }


    }
}
