package arrays;

import java.util.Arrays;

public class MidThreeArray {
    //Учитывая массив целых чисел нечетной длины,
    // верните новый массив длиной 3, содержащий элементы
    // из середины массива. Длина массива будет не менее 3.

    //midThree([1, 2, 3, 4, 5]) → [2, 3, 4]

    public static void main(String[] args) {
      int [] numbers = {1, 7, 8, 9, 5};
        System.out.println(Arrays.toString(midThree(numbers)));
    }


    public static int[] midThree(int[] nums) {

        return new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2], nums[(nums.length / 2) + 1]};
//        finishArray = {}:
//
//
//        int middle = nums.length/2;
//        int[] finishArray = new int [3];
//        for (int i = 0; i < finishArray.length; i++, middle++) {
//            finishArray[i] = nums[middle - 1];
//        }
//        return finishArray;
    }
}
