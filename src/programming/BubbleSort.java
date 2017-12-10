/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

/**
 *
 * @author KSI
 */
public class BubbleSort {

    static void bubbleSortM(int[] arr) {
        int n = arr.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 9, 1, 56, 73, 6, 23, 17};

        System.out.println("Array Before Bubble sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSortM(arr);
        System.out.println("Array Value After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
