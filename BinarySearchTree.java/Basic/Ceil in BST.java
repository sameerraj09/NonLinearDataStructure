class Tree {
    // ans[0] stores the minimum difference found so far
    // ans[1] stores the ceil value of the given key
    int [] ans = new int[]{Integer.MAX_VALUE, -1};

    // Function to return the ceil of the given number in BST.
    int findCeil(Node root, int key) {
        // If root is null, return the stored ceil value.
        if (root == null) return ans[1];

        // Calculate the difference between the current node's value and the key.
        int diff = root.data - key;

        // If the current node's value is exactly equal to the key, return it (ceil is the key itself).
        if (diff == 0) return key;

        // If the current node's value is greater than the key, it could be a possible ceil.
        if (diff > 0) {
            // Check if this is the closest ceil found so far.
            if (diff < ans[0]) {
                ans[1] = root.data; // Update the ceil value
                ans[0] = diff;      // Update the minimum difference
            }
            // Move left to find a smaller possible ceil value.
            return findCeil(root.left, key);
        } 

        // If the current node's value is smaller than the key, move right.
        return findCeil(root.right, key);
    }
}
