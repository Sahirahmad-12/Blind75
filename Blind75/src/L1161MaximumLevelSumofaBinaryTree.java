
import java.util.*;

public class L1161MaximumLevelSumofaBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;
        int ans = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {

            level++;
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();
                sum += curr.val;

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
    }
}
