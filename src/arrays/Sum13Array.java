package arrays;

public class Sum13Array {
    //Return the sum of the numbers in the array, returning 0 for an empty array.
    // Except the number 13 is very unlucky, so it does not count and numbers that
    // come immediately after a 13 also do not count.
    public static void main(String[] args) {
        int[] array = {1, 2, 13, 2, 1, 13};
        System.out.println(sum13(array));
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            return sum;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 13){
               i++;
               continue;
            }
            sum = sum + nums[i];
        }
        return sum;
    }
}
