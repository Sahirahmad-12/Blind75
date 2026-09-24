//Leetcode 53. Maximum Subarray

//Kadane's Algorithm

public class Pro5 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int MaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(currentSum + nums[i]>nums[i]){
                currentSum+=nums[i];
            }else {
                currentSum = nums[i];
            }
            MaxSum = Math.max(MaxSum, currentSum);
        }
        return MaxSum;
    }
    public static void main(String[] args) {
    }
}
