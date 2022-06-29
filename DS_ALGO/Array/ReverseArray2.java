package DS_ALGO.Array;

public class ReverseArray2 {
    static void ReverseArr2(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
    static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int[] myArr = {12,3,2342,3,23,1,12,12,12,23,00};
        ReverseArr2(myArr, 0, myArr.length-1);
        printArr(myArr);
    }
    
}
