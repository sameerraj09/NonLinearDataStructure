class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // Base case: If there is no left child, the current node is the smallest element.
        if (root.left == null) return root.data;

        // Recursively move to the left child to find the minimum value.
        return minValue(root.left);
    }
}
