
import java.util.Arrays;

class DeleteArrayElements{
public static void main(String[] args) {
    // delete any elemnt from array
    // from begginning , end and middle
    int[] nums = {1,2,3,4,55,5,6,7};
    // deleteAtBegin(nums);
    // deleteAtEnd(nums);
    deleteAtAny(nums , 4);
    System.out.println(Arrays.toString(nums));
    
}

private static void deleteAtAny(int[] nums, int n) {
for(int i=n+1 ; i<nums.length ; i++){
    nums[i-1] = nums[i];
}
}

private static void deleteAtEnd(int[] nums) {
    // just decrease length of array by one 
   int length = nums.length;
   length--;
   for (int i = 0; i < length; i++) {
    System.out.print(" "+nums[i]);
   }
}

private static void deleteAtBegin(int[] arr) {

    // delete first element and shift all other left by one
    for (int i = 1; i < arr.length; i++) {
        arr[i-1] = arr[i];
    }
    int[] temp = new int[arr.length-1];
    for (int i =0 ; i<arr.length - 1 ; i++) {
        temp[i] = arr[i];
    }
    System.out.println(Arrays.toString(temp));
}
}