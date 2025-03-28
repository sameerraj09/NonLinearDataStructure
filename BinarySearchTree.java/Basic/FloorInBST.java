class Solution {
    // ans[0] stores the minimum difference found so far
    // ans[1] stores the floor value of the given key
    int[] ans = new int[]{Integer.MAX_VALUE, -1};

    public int floor(Node root, int x) {
        // If the root is null, return the stored floor value.
        if (root == null) return ans[1];

        // Calculate the difference between x and the current node's value.
        int diff = x - root.data;

        // If the current node's value is equal to x, return it (floor is the key itself).
        if (diff == 0) return x;

        // If the current node's value is smaller than or equal to x, it can be a potential floor.
        if (diff > 0) {
            // Update the floor value if it's the closest seen so far.
            if (diff < ans[0]) {
                ans[0] = diff;
                ans[1] = root.data;
            }
            // Move right to find a larger possible floor value.
            return floor(root.right, x);
        }

        // If the current node's value is greater than x, move left.
        return floor(root.left, x);
    }
}
