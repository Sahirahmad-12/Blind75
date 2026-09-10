public class KadanesAlgoArray {
    public int maxSubArray(int[] nums){
        int sum = 0;
        int maxi = Integer.MAX_VALUE;

        for (int i = 0;  i< nums.length; i++) {

            //create sum
            sum = sum+nums[i];

            //update the maxi
            maxi = Math.max(maxi, sum);

            //check the sum for negative value
            if(sum<0)
                sum = 0;
        }
        //return max value
        return maxi;
    }
    public static void main(String[] args) {

    }
}
