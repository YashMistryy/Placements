package com.yash;

public class CheckIfArrSorted {
    static int prev = -6969;
    public static void main(String[] args) {
        int[] myArr = {11,22,22,33,44,55,66,77};
        checkIfSorted(myArr,0);
    }

    private static void checkIfSorted(int[] arr, int idx) {
    if(idx == arr.length){
        return;
    }
    else if(arr[idx]<=prev){
        System.out.println("sorry array is not sorted strictly increasing!!");
        return;
    }else{
        prev = arr[idx];
        checkIfSorted(arr, idx+1);
        System.out.println("array sorted");
        return;
    }

    
    }
    
}
