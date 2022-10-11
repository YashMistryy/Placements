package com.yash;
import java.util.Arrays;
public class InsertionSortDemo {
    
    public static void main(String[] args) {
        // insertion sort
        // time complexity = O(n^2)for worst-average case and O(n) for best case
        int[] myArr = {23,34,5,3,65,34,65,87,6,8};
        insertionSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
    static void insertionSort(int[] arr){
        int currentVal = 0;

        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            currentVal = arr[i];
            while(j>=0 && arr[j]>currentVal){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentVal;
        }
    }
}
