import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>(); // This will store the final result (level-wise nodes)
        
        if (root == null) return ans; // If the tree is empty, return an empty list

        Queue<TreeNode> q = new LinkedList<>(); // Queue to help in level-order traversal (BFS)
        q.add(root); // Start with the root node

        while (!q.isEmpty()) { // While there are nodes to process
            List<Integer> level = new ArrayList<>(); // List to store nodes of the current level
            int sz = q.size(); // Get the number of nodes in the current level

            for (int i = 0; i < sz; i++) { // Process all nodes of the current level
                TreeNode curr = q.remove(); // Remove the front node from the queue
                level.add(curr.val); // Add its value to the level list

                if (curr.left != null) q.add(curr.left); // Add left child if it exists
                if (curr.right != null) q.add(curr.right); // Add right child if it exists
            }

            ans.add(level); // Add the current level list to the final result
        }
        
        return ans; // Return the list of all levels
    }
}
