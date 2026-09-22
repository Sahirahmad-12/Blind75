//Leetcode 217 :: Contains Duplicate

//Brute Force
//public class Pro3 {
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//
//    }
//}

//Sorting Approach

//import java.util.Arrays;
//
//public class Pro3{
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i] == nums[i-1]){
//                return true;
//            }
//
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//
//    }
//}


//Hashmap Approach

import java.util.HashMap;

public class Pro3{
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> Nakli = new HashMap<>();
        for(int num:nums){
            if(Nakli.containsKey(num)){
                return true;
            }
            Nakli.put(num, 1);
        }
        return false;
    }

        public static void main(String[] args) {

    }
}
