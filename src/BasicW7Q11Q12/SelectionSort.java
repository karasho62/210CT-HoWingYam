package BasicW7Q11Q12;

public class SelectionSort {

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[smallest]) {
                    smallest = j;
                }
            }
            //select the left one as smallest to compare with each one in right side
            //find which one is smallest
            //then swap it with the original i
            //and repeat it
            swap(data, smallest, i);
        }
    }

    public static void swap(int[] array, int smallest, int index) {
        int temp = array[smallest];
        array[smallest] = array[index];
        array[index] = temp;
    }

    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
