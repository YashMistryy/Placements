import java.util.Arrays;

public class ReplaceArrayElements {
    public static void main(String[] args) {
        // replace element to greatest of it's right elements
        int[] nums = {400};
        replaceElements(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void replaceElements(int[] nums) {
        int max =0 ;
        for (int i = 0; i < nums.length; i++) {
           if(i == nums.length-1){
            nums[i] = -1;
            return;
           }else {
            max = nums[i+1]; 
            for (int j = i+1; j < nums.length; j++) {
                if(max<nums[j]){
                    max = nums[j];
                }
            }
            nums[i] = max;
           }
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
