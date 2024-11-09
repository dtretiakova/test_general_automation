package arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse3(array3)));
    }
// Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

    public static int[] reverse3(int[] nums) {
        int[] arrayFinal = new int[nums.length];
        int start = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            arrayFinal[start] = nums[i];
            start++;
        }
        return arrayFinal;
    }

}
