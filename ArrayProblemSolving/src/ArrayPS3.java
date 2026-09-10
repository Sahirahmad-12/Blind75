public class ArrayPS3 {
    public static int findUniqueElement(int[] nums){
        int xorSum = 0;
        for(int n : nums){
            xorSum = xorSum^n;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        int result = findUniqueElement(nums);
        System.out.println("Unique Element: " + result);
    }
}
