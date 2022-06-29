package DS_ALGO.Array;


 class ReverseArray {

  static  public int[] ReverseArr(int[] arr){
       int n = arr.length;
       int[] result = new int[n];
       int i=0,j=n;

       for(i=0;i<n;i++){
           result[j-1] = arr[i];
           j--;
       }
        return result;
    }
  public static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
       int[] resultArr=( ReverseArr(new  int[] {1,2,3,4,5,7,6}));
       printArr(resultArr);

    }
    
}
