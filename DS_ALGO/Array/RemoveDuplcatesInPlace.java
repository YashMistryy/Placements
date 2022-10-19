import java.util.Arrays;

public class RemoveDuplcatesInPlace {
    public static void main(String[] args) {
        // remove duplicates in a sorted array in ascending order
        int[] nums = {1,2,3,4,4};
        removeDuplicates(nums);
    }

    private static void removeDuplicates(int[] nums) {
    int index = 1 ;
    int count = 0 ;
  
        for (int k = 0; k < nums.length-1; k++) {
            int first = nums[k];
            int second = nums[k+1];
            if(first!=second){
                nums[index++] = second; 
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }
    
    
}
