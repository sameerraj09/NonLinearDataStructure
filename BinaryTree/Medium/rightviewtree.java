class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>(); // List to store the right-side view nodes
        if (root == null) return ans; // If tree is empty, return an empty list

        Queue<TreeNode> q = new LinkedList<>(); // Queue for level-order traversal (BFS)
        q.add(root); // Start with the root node

        while (!q.isEmpty()) {
            int sz = q.size(); // Number of nodes at the current level
            
            for (int i = 0; i < sz; i++) {
                TreeNode curr = q.remove(); // Remove the front node from the queue
                
                // If it's the last node of the current level, add it to the answer list
                if (i == sz - 1) ans.add(curr.val); 

                // Add left child to the queue if it exists
                if (curr.left != null) q.add(curr.left);
                
                // Add right child to the queue if it exists
                if (curr.right != null) q.add(curr.right);
            }
        }
        return ans; // Return the list of right-side view nodes
    }
}
