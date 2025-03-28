class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If both p and q are greater than the root, move to the right subtree
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        // If both p and q are smaller than the root, move to the left subtree
        else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        // If p and q lie on either side of root or one of them is root, return root
        else {
            return root;
        }
    }
}
