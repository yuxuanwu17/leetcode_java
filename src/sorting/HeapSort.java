package sorting;

import java.util.Arrays;

public class HeapSort {

    public void sort(int arr[]) {
        int n = arr.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            // Move current node to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is an index in arr[]. n size of heap

    public void heapify(int[] arr, int n, int i) {
        int largest = i; // initialize the largest as the root
        int left = 2 * i + 1; // the left node would be 2*i+1
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            // swap the value
            swap(arr, i, largest);

            // recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int arr[] = {12, 11, 13, 5, 6, 7};
        heapSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
