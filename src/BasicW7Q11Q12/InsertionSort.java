package BasicW7Q11Q12;

public class InsertionSort {

    static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int j;
            for (j = i; j > 0 && tmp < data[j - 1]; j--) {
                data[j] = data[j - 1];
            }
            data[j] = tmp;
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
