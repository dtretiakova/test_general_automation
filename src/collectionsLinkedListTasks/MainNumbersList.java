package collectionsLinkedListTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2.Напиши программу, которая создает ArrayList из чисел,добавляет в него числа от 1 до 10,
// удаляет число 5 и выводит оставшиеся элементы на экран.

public class MainNumbersList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>(10);
        int maxValue = 9;
        int minValue = 1;


        while (numbersList.size() <= maxValue){
            System.out.println("Please enter positive number from 1 to 10:");
            int num = scanner.nextInt();
            if (num > maxValue && num < minValue){
                System.out.println("You can enter only numbers from 1 to 10");
                break;
            }
            numbersList.add(num);
        }

        if (numbersList.contains(5)){
            numbersList.remove(Integer.valueOf(5));
        }
        System.out.println(numbersList.toString());
    }
}
