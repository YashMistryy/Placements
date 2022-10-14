
public class MinimumInArray {
    static int FindMinimum(int[] arr){
        
        int n=arr.length;
        int minNum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<minNum)
            minNum=arr[i];
        }
        return minNum;
    }
    static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int[] myArr = {2,4,6,-5,8-9,1,0,77,-10};
        System.out.println(FindMinimum(myArr));
    }
    
}
