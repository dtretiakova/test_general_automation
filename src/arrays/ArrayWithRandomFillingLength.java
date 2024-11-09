package arrays;

import java.util.Arrays;
import java.util.Random;
//Создать массив  типа int рандомной длини от 7 до 15 елементов и заполнить его рандомними числами от 0 до 100.

public class ArrayWithRandomFillingLength {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(7,15) + 1;
        int [] array = new int[randomNumber];

        for (int i = 0; i < randomNumber ; i++) {
           int fillingTheNumber = random.nextInt(100);
           array [i] = fillingTheNumber;

        }
        System.out.println(Arrays.toString(array));
    }
}
