import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        // sort by parity
        // given array put all the even number in front and odd at last
        int[] nums = {3,1,2,4};
        int j =0;
        int temp;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]%2==0 && nums[j]%2!=0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j]%2==0)j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
