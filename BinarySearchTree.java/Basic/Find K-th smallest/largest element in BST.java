class Solution {
    public int kthSmallest(TreeNode root, int k) {
        // Create a list to store the elements in sorted order (inorder traversal)
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Perform inorder traversal to store elements in sorted order
        inorder(root, ans);
        
        // Return the k-th smallest element (0-based index, so k-1)
        return ans.get(k - 1);
    }

    public void inorder(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) return; // Base case: If node is null, return
        
        inorder(root.left, ans);  // Visit left subtree (smaller values)
        ans.add(root.val);        // Store the current node value
        inorder(root.right, ans); // Visit right subtree (larger values)
    }
}
