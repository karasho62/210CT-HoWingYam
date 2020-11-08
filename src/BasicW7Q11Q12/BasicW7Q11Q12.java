package BasicW7Q11Q12;

import java.util.Scanner;

public class BasicW7Q11Q12 {
    public static void main(String args[]) {
        int[] array = {5,13,29,59};
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        //BubbleSort is faster is this case
        //as it counts the finised part in looping to reduce workload
        System.out.println("Please enter a number. BubbleSort array");
         System.out.println("1=BubbleSort array, 2=SelectionSort array, 3=InsertionSort, 4=MergeSort, 5=QuickSort");
        int str1 = sc.nextInt();
        if (str1 == 1) {
            System.out.println("BubbleSort array");
            BubbleSort.bubbleSort(array);
            BubbleSort.printArray(array);
        } else if (str1 == 2) {
            System.out.println("SelectionSort array");
            SelectionSort.selectionSort(array);
            SelectionSort.printArray(array);
        } else if (str1 == 3) {
            System.out.println("InsertionSort array");
            InsertionSort.insertionSort(array);
            InsertionSort.printArray(array);
        } else if (str1 == 4) {
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(array, 0, array.length - 1);
            System.out.println("MergeSort array");
            mergeSort.printArray(array);
        } else if (str1 == 5) {
            QuickSort ob2 = new QuickSort();
            ob2.sort(array, 0, n - 1);
            System.out.println("QuickSort array");
            QuickSort.printArray(array);
        }
    }
}
