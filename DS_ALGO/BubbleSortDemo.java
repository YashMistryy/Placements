package com.yash;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] myArr = {23,34,5,3,65,34,65,87,6,8};
        // performing bubble sort
        // time complexity is O(n²)
        bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
   static void bubbleSort(int[] arr){
    int n = arr.length;
    int temp;

    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i+1; j < arr.length - 1; j++) {
            if(arr[i]<arr[j]){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    }
}
