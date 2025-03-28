class Solution {
    public boolean isSymmetric(TreeNode root) {
        // If the tree is empty, it's symmetric
        return root == null || func(root.left, root.right);
    }

    // Helper function to check if two subtrees are mirror images of each other
    public boolean func(TreeNode L, TreeNode R) {
        // If both subtrees are null, they are symmetric
        if (L == null && R == null) return true;

        // If one is null and the other is not, they are not symmetric
        if (L != null ^ R != null) return false; // XOR condition (one is null, the other isn't)

        // If values of both nodes are different, not symmetric
        if (L.val != R.val) return false;

        // Recursively check if:
        // 1. Left subtree of L matches the right subtree of R
        // 2. Right subtree of L matches the left subtree of R
        return func(L.left, R.right) && func(L.right, R.left);
    }
}
