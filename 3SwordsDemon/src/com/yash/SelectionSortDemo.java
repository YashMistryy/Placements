package com.yash;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        // selection sort demo
        // time complexity = O(n^2)
        int[] myArr = {23,34,5,3,65,34,65,87,6,8};
        selctionSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
    static void selctionSort(int[] arr){
        int minIndex = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                int temp =0;
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    private static void swap(int i, int j) {
        int temp=0;
        temp = i;
        i=j;
        j=temp;
    }
}
