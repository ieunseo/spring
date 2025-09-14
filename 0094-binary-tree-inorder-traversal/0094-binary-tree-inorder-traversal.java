/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode(root, res);
        return res;
    }

    private void TreeNode(TreeNode node, List<Integer> res) {
        if (node == null) return;
        TreeNode(node.left, res);       // 1. 왼
        res.add(node.val);              // 2. 현재
        TreeNode(node.right, res);      // 3. 오
    }
}
                                                                                    