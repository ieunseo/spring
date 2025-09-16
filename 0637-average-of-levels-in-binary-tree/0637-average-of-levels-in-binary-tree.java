import java.util.*;

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

 이진 트리가 주어졌을 때, 각 레벨(층)에 있는 노드 값들의 평균을 구해서 리스트로 반환하세요.

루트는 레벨 0

그 자식들은 레벨 1

그 손자들은 레벨 2 … 이런 식으로 내려갑니다

 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> tree = new ArrayList<>();
        if (root == null) return tree;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            double sum = 0.0;

            for (int i = 0; i < size; i++) {
                TreeNode cur = q.remove();
                sum += cur.val;

                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }

            tree.add(sum / size);
        }

        return tree;
    }
}
