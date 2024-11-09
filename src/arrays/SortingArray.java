package arrays;

import java.util.Arrays;

/* пузирьковая сортировка за одну итерацию цикла максимальний єлемент вспливаетв  конец
         first iteration
         5 3 1
         5 > 3      3 5 1
         5 > 1      3 1 5
        second iteration
         */

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
       }
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        for (int j = 0; j < arr.length; j++) {
            boolean exit = true;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    exit = false;
                }
            }
            counter++;
            if(exit) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);
    }

}





