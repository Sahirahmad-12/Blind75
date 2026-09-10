//Two Sum

//public class ArrayPS4 {
//
//    public int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//
//        for (int i = 0; i <= n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//
//                if (nums[i] + nums[j] == target) {
//                    int ans[] = {i, j};
//                    return ans;
//                }
//            }
//        }
//
//        int ans[] = {};
//        return ans;
//    }
//
//    public static void main(String[] args) {
//
//        ArrayPS4 obj = new ArrayPS4();
//
//        int nums[] = {2, 7, 11, 15};
//        int target = 9;
//
//        int result[] = obj.twoSum(nums, target);
//
//        System.out.println(result[0] + " " + result[1]);
//    }
//}

//Remove duplicates from Sorted Array

//public class ArrayPS4 {
//    public int removeDuplicates(int[] nums){
//        int i = 0;
//        int j = 1;
//        int n = nums.length;
//
//        while (j<n){
//            if(nums[i] == nums[j]){
//                j++;
//            }
//            else {
//                i++;
//                nums[i] = nums[j];
//                j++;
//            }
//        }
//        return i+1;
//    }
//    public static void main(String[] args) {
//    }
//}

//Find first repeating element

//import java.util.HashMap;
//
//public class ArrayPS4 {
//    public int findFirstRepeatingElement(int[] arr){
//        HashMap<Integer, Integer> freq = new HashMap<>();
//        for(int num: arr){
//            freq.put(num, freq.getOrDefault(num, 0)+1);
//        }
//        for(int i: arr){
//            if(freq.get(i)>1){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//
//    }
//}

//find the pivot element
//Pivot --> array me ek aisa index find out krna hai jiske left aur right ke element ka sum equal ho

//public class ArrayPS4 {
//    public int pivotIndex(int[] nums){
//        int n = nums.length;
//        int leftSum[] = new int[n];
//        int rightSum[] = new int[n];
//
//        //fill left sum array
//        leftSum[0] = nums[0];
//        for (int i = 1; i < n; i++) {
//            leftSum[i] = leftSum[i-1]+nums[i];
//        }
//
//        //fill right sum wala aaray
//        rightSum[0] = nums[0];
//        for (int i = 1; i < n; i++) {
//            rightSum[i] = rightSum[i-1]+nums[i];
//        }
//        for (int i = 0; i < n; i++) {
//            if(leftSum[i] == rightSum[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//    }
//}

//Missing Elements from An array with duplicates

import java.util.ArrayList;
import java.util.List;

public class ArrayPS4 {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int index = 0; index < n; index++) {
            int value = Math.abs(nums[index]);
            int position = value-1;

            if(nums[position]>0){
                nums[position] = -nums[position];
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]>0){
                int valueAtThidIndex = i+1;
                ans.add(valueAtThidIndex);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    }
}