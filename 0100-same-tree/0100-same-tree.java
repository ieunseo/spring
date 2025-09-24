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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //  1. 둘 다 null이면 같은 트리
        if (p == null && q == null) return true;
        
        // 값이 다르면 다른 트리
        if (p == null || q == null || p.val != q.val) return false;
        
        // 2. 둘 다 존재하고 값이 같으면 왼쪽과 오른쪽 서브트리도 모두 같아야 함
        // 재귀호출로 다른노드들도 비교
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}