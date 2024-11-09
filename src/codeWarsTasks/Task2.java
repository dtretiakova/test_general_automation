package codeWarsTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class Task2 {
    //1 2 3 4 5      1, 2456, rfr45
    public static String highAndLow(String numbers) {
        String[] num = numbers.split(" ");
        int[] nums = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            nums[i] = Integer.parseInt(num[i]);

        }

        Arrays.sort(nums);
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.append(nums[nums.length - 1]).append(" ").append(nums[0]).toString();
    }
}
