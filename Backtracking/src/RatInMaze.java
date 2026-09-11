public class RatInMaze {
    public int numberOfPaths(int m, int n){
        return paths(0,0,m-1,n-1);
    }
    private int paths(int r, int c, int er, int ec){
        if(r==er && c==ec) return 1;
        if(r>er || c>ec) return 0;
        int rightWays = paths(r,c+1,er,ec);
        int downWay = paths(r+1,c,er,ec);
        return rightWays+downWay;
    }

    public static void main(String[] args) {

    }
}
