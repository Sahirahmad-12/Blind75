public class Pro8 {

    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        int prev2 = 1;
        int prev1 = 2;

        for(int i = 3; i <= n; i++){
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        Pro8 obj = new Pro8();

        System.out.println(obj.climbStairs(5));
    }
}
