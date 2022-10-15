package arrays;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // remove duplicates from ascending order array
        // relative order should be maintained
        int[] nums = {0,0,1,1,2,2,3,4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        

    }

     static int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == nums[i]){
                    nums[j--] = nums[j];
                }
            }
        }
        return 0;
    }
}
