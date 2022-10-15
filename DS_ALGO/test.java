import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        // remove duplicates from ascending order array
        // relative order should be maintained
        int[] nums = {0,0,1,1};
        int count = 1 ;
        int index = 1;
        for (int i = 0; i < nums.length-1; i++) {
            int first = nums[i];
            int second = nums[i+1];
            if(first!= second){
                nums[index++] = second;
                count++;
            }
        }
       
        System.out.println(count);
        System.out.println(Arrays.toString(nums));
        

    }

    
}
