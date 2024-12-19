class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
        // Start converting the array into a Max-Heap from bottom to top
        // Begin from the last non-leaf node (N-1)/2 and work upwards
        for (int i = (N - 1) / 2; i >= 0; i--) {
            heapify(i, arr); // Fix the heap property for the current subtree
        }
    }

    // Helper function to ensure the heap property for a subtree rooted at index `i`
    public static void heapify(int i, int arr[]) {
        int maxIdx = i; // Assume the current node is the largest
        int left = (2 * i) + 1; // Calculate the left child index
        int right = (2 * i) + 2; // Calculate the right child index

        // Check if the left child is greater than the current node
        if (left < arr.length && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        // Check if the right child is greater than the current node or the left child
        if (right < arr.length && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        // If the current node is not the largest, swap it with the largest child
        if (i != maxIdx) {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            // Recursively call heapify for the affected subtree
            heapify(maxIdx, arr);
        }
    }
}
