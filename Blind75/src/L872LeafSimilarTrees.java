import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class L872LeafSimilarTrees {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getLeaves(root1, list1);
        getLeaves(root2, list2);
        return list1.equals(list2);
    }
    private void getLeaves(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        getLeaves(root.left, list);
        getLeaves(root.right, list);

    }
    public static void main(String[] args) {
    }
}
