public class L790DominoandTrominoTiling {
    public int numTilings(int n) {
        int mod = 1000000007;
        if(n == 1) return 1;
        if(n == 2) return 2;
        long a = 1;
        long b = 1;
        long c = 2;
        for(int i = 3; i<=n ; i++){
            long curr = (2*c+a)%mod;
            a = b;
            b = c;
            c = curr;
        }
        return (int) c;
    }
    public static void main(String[] args) {
    }
}
