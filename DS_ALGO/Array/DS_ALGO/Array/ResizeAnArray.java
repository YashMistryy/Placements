package DS_ALGO.Array;

public class ResizeAnArray {

    static int[] resizeArray(int[] arr , int newCapacity){
        int[] temp = new int[newCapacity];

        for(int i=0 ; i<arr.length ; i++)
            temp[i] = arr[i];

     return temp;
    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6,7,8,9};
        printArr(resizeArray(myArr,10));

    }
}
