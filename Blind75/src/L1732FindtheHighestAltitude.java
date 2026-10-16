public class L1732FindtheHighestAltitude {
    class Solution {
        public int largestAltitude(int[] gain) {
            int altitude = 0;
            int maxAltitude = 0;

            for(int i = 0; i < gain.length; i++){
                altitude = altitude+gain[i];

                if(altitude > maxAltitude){
                    maxAltitude = altitude;
                }
            }
            return maxAltitude;
        }
    }
    public static void main(String[] args) {
    }
}
