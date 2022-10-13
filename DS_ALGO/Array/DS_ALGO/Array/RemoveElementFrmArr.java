package DS_ALGO.Array;

import java.util.Arrays;

public class RemoveElementFrmArr {
    public static void main(String[] args) {
        // remove each occurence of an element from an array
        // then sort the array part which is correct
         int[] nums = {1,2,3,4,55,5,6,7,55,8,9,11,55,55};
        reoveElement(nums, 55);
    }

    private static void reoveElement(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == n)
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == n){
                // count++;
                for (int j = i+1; j < nums.length; j++) {
                    nums[j-1] = nums[j];                    
                }
                System.out.println(Arrays.toString(nums));
            }

        }
        System.out.println(count);
        for (int i = 0; i < nums.length-count; i++) {
            System.out.print(nums[i]+" ");
        }
        // System.out.println(Arrays.toString(nums));

    }
}
