import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        // return indices 
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(getIndices(nums,18)));
    }
    public static int[] getIndices(int[] nums , int target){
        int[] result = new int[2];
        int k =0;
        // return indices of two element which makes up to target when added
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j< nums.length;j++) {
                if(nums[i]+nums[j] == target){
                result[k++] = i;
                result[k] = j;
            return result;}
            }
        }
        return result;
    }
}
