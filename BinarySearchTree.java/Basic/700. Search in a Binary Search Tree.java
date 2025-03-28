class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // If the tree is empty or we reach a null node, return null (value not found)
        if (root == null) return null;

        // If the current node's value matches the target value, return the node
        if (root.val == val) return root;

        // If the target value is smaller than the current node's value,
        // search in the left subtree
        if (root.val > val) return searchBST(root.left, val);

        // If the target value is greater, search in the right subtree
        return searchBST(root.right, val);
    }
}
