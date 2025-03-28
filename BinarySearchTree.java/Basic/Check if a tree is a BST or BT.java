class Solution {
    // List to store elements during inorder traversal
    ArrayList<Integer> ans = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        // Start inorder traversal to check if the tree is a valid BST
        return inorder(root, true);
    }

    public boolean inorder(TreeNode root, boolean flag) {
        if (root == null) {
            return true; // Base case: If node is null, return true
        }

        // Recursively check the left subtree
        flag &= inorder(root.left, flag);

        // Check if the current node violates the BST property
        if (ans.size() > 0) {
            if (root.val <= ans.get(ans.size() - 1)) {
                return false; // If current node is smaller than or equal to the previous node, it's not a BST
            }
        }

        // Store current node value for future comparison
        ans.add(root.val);

        // Recursively check the right subtree
        flag &= inorder(root.right, flag);

        return flag; // Return the final flag value
    }
}
