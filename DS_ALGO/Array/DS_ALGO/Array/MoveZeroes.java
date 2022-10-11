package DS_ALGO.Array;

public class MoveZeroes {
    static int[] MoveZeroesToEnd(int[] arr){
        int n = arr.length;
        // i for non-zero values and j for holding zeroes
        int i = 0;
        int j = 0;
        int temp;

        for(i=0 ; i<n ; i++){
            if(arr[i]!=0 && arr[j]==0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if( arr[j]!=0){
                j++;
            }

        }
        return arr;
    } 
   public static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");
    }


    public static void main(String[] args) {
        int[] myArr = {1,2,3,0,9,80,0,9,0};
        printArr(MoveZeroesToEnd(myArr));
        
    }
    
}
