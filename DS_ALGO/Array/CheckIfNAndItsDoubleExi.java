public class CheckIfNAndItsDoubleExi {
    public static void main(String[] args) {
        // check if array contains n and 2n
        int[] nums  = {1,22,3,44,5,66};
        checkIfDoubleExists(nums);
        
    }

    private static void checkIfDoubleExists(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && nums[j] == 2*val)
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
