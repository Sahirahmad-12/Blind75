import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L1493LongestSubarrayof1sAfterDeletingOneElement {
    public int sumCounts(List<Integer> nums) {
        int sum = 0 ;
        int n = nums.size();
        for(int i = 0; i<n; i++){
            Set<Integer> set = new HashSet();

            for(int j = i; j<n; j++){
                set.add(nums.get(j));

                int count = set.size();
                sum += count*count;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
    }
}
