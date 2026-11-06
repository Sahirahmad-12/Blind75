import java.util.HashSet;
import java.util.PriorityQueue;

public class L2336SmallestNumberinInfiniteSet {
    PriorityQueue<Integer> pq;
    HashSet<Integer> set;
    int current;

    public L2336SmallestNumberinInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        current = 1;

    }

    public int popSmallest() {
        if(!pq.isEmpty()){
            int ans = pq.poll();
            set.remove(ans);
            return ans;
        }
        return current++;

    }

    public void addBack(int num) {
        if(num<current && !set.contains(num)){
            pq.offer(num);
            set.add(num);
        }

    }
    public static void main(String[] args) {
    }
}
