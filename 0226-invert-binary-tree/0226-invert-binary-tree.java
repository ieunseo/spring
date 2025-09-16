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

주어진 이진 트리의 왼쪽과 오른쪽 자식을 모두 뒤집은(invert) 트리를 반환하는 문제입니다.

즉, 모든 노드에서 left와 right를 교환해야 합니다.

예시:

입력:    4
        / \
       2   7
      / \ / \
     1  3 6  9

출력:    4
        / \
       7   2
      / \ / \
     9  6 3  1

 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // root가 null 일때 null로 반환. (test3방어로직)
        if (root == null) return null;

        // 왼쪽과 오른쪽 자식을 서로 교환
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 왼쪽, 오른쪽 서브트리에 대해서도 재귀적으로 뒤집기 실행
        invertTree(root.left);
        invertTree(root.right);

        return root; // 뒤집힌 root 반환
    }
}