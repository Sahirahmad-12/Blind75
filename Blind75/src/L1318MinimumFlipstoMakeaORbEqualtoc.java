public class L1318MinimumFlipstoMakeaORbEqualtoc {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while(a>0 || b>0 || c>0){
            int bitA = a&1;
            int bitB = b&1;
            int bitC = c&1;
            if(bitC == 1){
                if(bitA == 0 && bitB == 0){
                    count++;
                }
            }
            else{
                count += bitA + bitB;
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
    }
}
