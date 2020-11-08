package BasicW7Q11Q12;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int done = 0; done < array.length - 1; done++) {
            for (int i = 0; i < array.length - done - 1; i++) {
                if (array[i] > array[i + 1]) {
                    //the left one compare with the right one
                    //if left > right, swap them, 
                    //else next element
                    //repeat it until all element in array have been done
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
