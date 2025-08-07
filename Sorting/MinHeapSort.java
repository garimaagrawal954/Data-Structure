import java.util.Scanner;

public class MinHeapSort {

    // Function to perform heap sort using Min Heap to get descending order
    public static void heapSortDescending(int[] arr) {
        int n = arr.length;

        // Step 1: Build Min Heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyMin(arr, n, i);

        // Step 2: Extract from Min Heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move min (root) to end
            int temp = arr[0]; arr[0] = arr[i]; arr[i] = temp;

            // Heapify the reduced heap
            heapifyMin(arr, i, 0);
        }

        // Final result is descending (no reverse needed)
    }

    // Min heapify subtree rooted at index i
    public static void heapifyMin(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) smallest = left;
        if (right < n && arr[right] < arr[smallest]) smallest = right;

        if (smallest != i) {
            int temp = arr[i]; arr[i] = arr[smallest]; arr[smallest] = temp;
            heapifyMin(arr, n, smallest);
        }
    }

    // Main function with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        heapSortDescending(arr);

        System.out.println("Sorted array (Descending using Min Heap):");
        for (int num : arr) System.out.print(num + " ");
    }
}
