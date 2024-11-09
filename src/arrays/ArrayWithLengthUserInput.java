package arrays;

import java.util.Arrays;
import java.util.Scanner;
//Создать массив типа int длина которого и его елементи вводятся пользователем с клавиатури

public class ArrayWithLengthUserInput {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");
        Scanner scanner = new Scanner (System.in);
        int length = scanner.nextInt();

        int [] numbers = new int[length];
        for (int i = 0; i < length ; i++) {
            int update = scanner.nextInt();
            numbers[i] = update;

        }
        System.out.print(Arrays.toString(numbers));


    }
}
