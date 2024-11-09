package arrays;

import java.util.Arrays;

public class MakeMiddleArrays {
    //makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    //Учитывая массив целых чисел четной длины, верните
    // новый массив длиной 2, содержащий два средних элемента из исходного массива.
    // Исходный массив будет иметь длину 2 или более.

    public static void main(String[] args) {
    int [] makeMiddleArray = {7, 1};
        System.out.println(Arrays.toString(makeMiddle(makeMiddleArray)));
    }

    public static int[] makeMiddle(int[] nums) {
        int center = nums.length/2;
        return new int[]{nums[--center], nums[++center]};
    }

}
