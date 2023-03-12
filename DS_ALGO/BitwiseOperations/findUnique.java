package BitwiseOperations;

public class findUnique {
    public static void main(String[] args) {
        // find unique element in array
        // XOR ^ with the same number gives zero 0 so every double element cancels itself
        int[] nums = {1,2,3,4,4,3,2};
        int uniq = 0;
        for (int i = 0; i < nums.length; i++) {
            uniq = uniq ^nums[i];
        }
        System.out.println(uniq);
    }
}
