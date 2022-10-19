import java.util.Arrays;

public class ThirdMaximumNum {
    public static void main(String[] args) {
        // find the third max number and if not present give the maximum number
        int[] nums = {3,2,2,8,0,4};
        // findThirdMax(nums);
        System.out.println(Integer.MIN_VALUE);
    }

    private static void findThirdMax(int[] nums) {
        int one = 0;
        int two = 0;
        int third = 0; 
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i : nums) { 
            if(i>third){ 
                one = two;
                two = third;
                third = i;
            }
           
        }
        System.out.println(one+"  "+two+"  "+third);
        System.out.println("-------------------------------");
        if(one!=0)
            System.out.println(one);       
        else
            System.out.println(third);

    }
}
