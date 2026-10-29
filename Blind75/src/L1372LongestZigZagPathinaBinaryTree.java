
class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    int max = 0;

    public int longestZigZag(TreeNode root) {
        max = 0;
        dfs(root, 0, 0);
        return max;
    }

    private void dfs(TreeNode node, int left, int right) {
        if (node == null) {
            return;
        }

        max = Math.max(max, Math.max(left, right));

        // Move left
        dfs(node.left, right + 1, 0);

        // Move right
        dfs(node.right, 0, left + 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.left.right = new TreeNode(4);

        System.out.println(sol.longestZigZag(root));
    }
}
