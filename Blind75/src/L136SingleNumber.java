public class L136SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums){
            ans = ans^num;
        }
        return ans;
    }
    public static void main(String[] args) {
    }
}
