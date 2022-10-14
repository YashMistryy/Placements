package DS_ALGO.Array;

import java.util.Arrays;

public class RemoveElementFrmArr {
    public static void main(String[] args) {
        // remove each occurence of an element from an array
        // then sort the array part which is correct
         int[] nums = {0,1,2,2,3,0,4,2};
       System.out.println(removeElement(nums, 2));
    }

    // private static void reoveElement(int[] nums, int n) {
       static int  removeElement(int[] arr , int val){
        int j = 0;
        for(int i:arr){
            if(i != val)
            arr[j++] = i;
        }
          System.out.println(Arrays.toString(arr));
          return j;
        }
}
