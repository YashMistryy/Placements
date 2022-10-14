
public class FindSecondMinArray {
    static int FindSecondMin(int[] arr)
    {
        int n=arr.length;
        int Min = Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i] < Min){
                SecondMin = Min;
                Min = arr[i];
            }
            else if(arr[i]<SecondMin && arr[i]!=Min){
                SecondMin = arr[i];
            }
        }



        return SecondMin;
    }



    public static void main(String[] args) {
        int[] myArr = {343,2,5,56546,56546,56546,3,243,242,3,5,89,68,2,3,6,6};
        System.out.println(FindSecondMin(myArr));

    }
    
}
