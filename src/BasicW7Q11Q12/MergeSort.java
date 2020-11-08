package BasicW7Q11Q12;

public class MergeSort {

    void merge(int[] array, int head, int middlePoint, int last) {
        int node1 = middlePoint - head + 1;
        int node2 = last - middlePoint;
        // Find sizes of two subarrays to be merged 
        //copy data to temp arrays and merge it
        int L[] = new int[node1];
        int R[] = new int[node2];
        for (int i = 0; i < node1; ++i) {
            L[i] = array[head + i];
        }
        for (int j = 0; j < node2; ++j) {
            R[j] = array[middlePoint + 1 + j];
        }
        int i = 0, j = 0, k = head;
        while (i < node1 && j < node2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < node1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < node2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int[] array, int head, int last) {
        if (head < last) {
            // Find the middle point and sort two parts 
            // Merge the sorted halves 
            int middlePoint = (head + last) / 2;
            sort(array, head, middlePoint);
            sort(array, middlePoint + 1, last);
            merge(array, head, middlePoint, last);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
