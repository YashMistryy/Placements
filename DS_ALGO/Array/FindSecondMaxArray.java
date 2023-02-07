
public class FindSecondMaxArray {
    static int findSecondMax(int[] arr){
        int n = arr.length;
        int max = 0;
        int SecondMax = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                SecondMax = max;
                max = arr[i];
            }
            else if(arr[i]>SecondMax && arr[i]!=max){
                SecondMax = arr[i];
            }
        }
       
         return SecondMax;
    }



    public static void main(String[] args) {
        int[] myArr = {2,5,56546};
       System.out.println( findSecondMax(myArr));
    }
    
}
