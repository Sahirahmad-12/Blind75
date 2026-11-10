import java.util.Arrays;

public class L2300SuccessfulPairsofSpellsandPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            int left = 0;
            int right = m-1;
            int first = m;
            while(left <= right){
                int mid = left+(right-left)/2;
                long product = (long) spells[i]*potions[mid];
                if(product >= success){
                    first = mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            ans[i] = m-first;
        }
        return ans;
    }
    public static void main(String[] args) {
    }
}
