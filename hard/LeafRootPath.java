import java.util.*;

class Solution {
    // Function to return all root-to-leaf paths in a binary tree
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // Stores all root-to-leaf paths
        ArrayList<Integer> curr = new ArrayList<>(); // Temporary list to store the current path
        func(curr, ans, root); // Helper function to find paths
        return ans;
    }

    // Recursive function to find all root-to-leaf paths
    public static void func(ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans, Node root) {
        curr.add(root.data); // Add current node to the path

        // If left child exists, explore left subtree
        if (root.left != null) func(curr, ans, root.left);

        // If right child exists, explore right subtree
        if (root.right != null) func(curr, ans, root.right);

        // If it's a leaf node (no left or right child), store the current path
        if (root.left == null && root.right == null) ans.add(new ArrayList<>(curr));

        curr.remove(curr.size() - 1); // Remove last node (backtracking)
    }
}
