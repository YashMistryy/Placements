import java.util.Arrays;

class AddElementsToArr{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,6};

        // add in the end
    //    System.out.println(Arrays.toString(addAtEnd(69 , nums)));
    // add at the begining of array
    System.out.println(Arrays.toString(addAtBegin(0,nums))); 
    }

    private static int[] addAtBegin(int i, int[] nums) {
        int[] arr = new int[nums.length+1];
        arr[0] = i;
        int j = 0;
        while(j<nums.length){
            arr[j+1] = nums[j];
            j++;
        }
        return arr;
    }

    private static int[] addAtEnd(int i, int[] nums) {
        int[] arr = new int[nums.length+1];
        int j = nums.length-1;
       while(j>=0){
        arr[j] = nums[j];
        j--;
       }
        arr[nums.length] = i;       
        return arr;
    }
}