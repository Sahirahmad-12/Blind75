Leetcode::1431::Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.List;

public class Pro11 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int candy : candies){
            if(candy > max){
                max = candy;
            }
        }
        for(int candy:candies){
            if(candy+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    }
}
