
import java.util.Arrays;

public class FindMissingNum {
    /*  n-1 distinct numbers are given whose range is from 1 to n
    find the missing number
    & mathematical answer is: the sum of i to n is n(n+1)/2 so by subtracting arraysum from total sum we get missing num
    */
    static int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int missingNum =0;
        int totalSum = n*(n+1)/2;
        missingNum = totalSum - ArraySum(arr);
        return missingNum;
    }
    static int ArraySum(int[] arr){
        int sum=0;
        for(int i=0 ; i<arr.length ;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        System.out.println(findMissingNumber(myArr));
    }
    
}
