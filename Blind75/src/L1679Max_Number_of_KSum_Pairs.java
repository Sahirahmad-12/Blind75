//Using HashMap
import java.util.HashMap;

public class L1679Max_Number_of_KSum_Pairs {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;
        for(int num : nums){
            int complement = k-num;

            if(map.getOrDefault(complement,0)>0){
                operations++;
                map.put(complement, map.get(complement)-1);
            }else{
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        return operations;

    }

    public static void main(String[] args) {

    }
}
