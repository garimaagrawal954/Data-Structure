import java.util.Scanner;

public class MaxHeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyMax(arr, n, i);

        // Extract elements one by one from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0]; arr[0] = arr[i]; arr[i] = temp;

            // Call max heapify on reduced heap
            heapifyMax(arr, i, 0);
        }
    }

    public static void heapifyMax(int[] arr, int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // left = 2*i + 1
        int right = 2 * i + 2;    // right = 2*i + 2

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i]; arr[i] = arr[largest]; arr[largest] = swap;
            heapifyMax(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        heapSort(arr);

        System.out.println("Sorted array (Max Heap Sort):");
        for (int i : arr) System.out.print(i + " ");
    }
}
