import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        // height checker checks if the indices are at correct position or not
        int[] nums = {1,3,2,5};
        checkHeight(nums);
    }

    private static void checkHeight(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }  
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=nums[i]){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));

    }
    
}
