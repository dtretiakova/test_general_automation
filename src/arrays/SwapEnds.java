package arrays;

import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
//Учитывая массив целых чисел,
// поменяйте местами первый и последний элементы массива.
// Верните измененный массив. Длина массива будет не менее 1
// swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
        int[] array1 = {1, 2, 4, 5, 6};
        System.out.println(Arrays.toString(swapEnds(array1)));
    }

    public static int[] swapEnds(int[] nums) {
        int start = nums[0];
        int finish = nums[nums.length - 1];
        int[] swapArray = nums;
        swapArray[0] = finish;
        swapArray[nums.length - 1] = start;
        return swapArray;

    }
}
