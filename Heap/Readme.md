### Learning

**Why we are calling the loop reverse to covert a array or max heap to min heap ?**

![image](https://github.com/user-attachments/assets/9c004b3e-c714-4ac0-bbca-6f0dbd9d82f7)

![image](https://github.com/user-attachments/assets/a7c9f90f-eee4-4319-9bb4-340051e0ccc4)


![image](https://github.com/user-attachments/assets/00fa94d8-6bda-4f2e-a65b-021e65d0d0ee)

class HeapSort {    
    public void heapSort(int arr[]) {
        int n = arr.length;
        // Step 1: Build a Max-Heap
        for (int i = (n - 1) / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Step 2: Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the root (largest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }
    // Heapify a subtree rooted at index i
    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child
        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        // If largest is not root
        if (largest != i) {
            // Swap root and largest
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
    // Main driver method to test the sorting
    public static void main(String args[]) {
        int arr[] = {4, 10, 3, 5, 1};
        HeapSort ob = new HeapSort();
        ob.heapSort(arr);
        System.out.println("Sorted array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

![image](https://github.com/user-attachments/assets/dfc1caf6-1bd5-420b-a5e7-7f13a67e6bce)

