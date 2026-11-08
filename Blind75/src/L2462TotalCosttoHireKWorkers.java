import java.util.PriorityQueue;

public class L2462TotalCosttoHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int i = 0;
        int j = costs.length - 1;
        while (i <= j && left.size() < candidates) {
            left.offer(costs[i]);
            i++;
        }
        while (i <= j && right.size() < candidates) {
            right.offer(costs[j]);
            j--;
        }
        long totalCost = 0;
        for (int hire = 0; hire < k; hire++) {
            if (right.isEmpty() || (!left.isEmpty() && left.peek() <= right.peek())) {
                totalCost += left.poll();
                if (i <= j) {
                    left.offer(costs[i]);
                    i++;
                }
            } else {
                totalCost += right.poll();
                if (i <= j) {
                    right.offer(costs[j]);
                    j--;
                }
            }
        }
        return totalCost;

    }
    public static void main(String[] args) {
    }
}
