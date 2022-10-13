import java.util.Arrays;

public class DuplicateZerores {
    public static void main(String[] args) {
        // duplicate zeroes means add a zero after each occurence of 0 in array
        // keep size of array same
        // alter the original array
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicateZeroes(nums);
    }

    private static void duplicateZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        int i = 0;

        while(i<nums.length && j<nums.length) {
            
            if(nums[i] != 0){
                arr[j] = nums[i];
                
            }else{
                arr[j] = 0;
                arr[j+1] = 0;
                j++;
            }
            i++;
            j++;
        }
        for (int k = 0; k < arr.length; k++) {
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
