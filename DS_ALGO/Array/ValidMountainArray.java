public 
class ValidMountainArray {
    public static void main(String[] args) {
        // valid mountain array is array whose length is greater than 3 and there exist a median value from where the slope decreases
        // return if given array is valid mountain or not
        int[] nums = {1,2,3,4,1};
        System.out.println(validate(nums));
    }

    private static boolean validate(int[] nums) {
        boolean flag = false;

        if(nums.length < 3)
            return false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]){          
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j-1] > nums[j]){
                    flag = true;
                }else {flag = false;}
            }
        }
    }return flag;
    }
}
// public boolean validMountainArray(int[] A) {
//     if (A.length < 3) return false;
//     int start = 0;
//     int end = A.length-1;
//     while (start < end) {
//       if (A[start+1] > A[start]) {
//         start++;
//       } else if (A[end-1] > A[end]) { 
//         end--;
//       } else {
//         break;
//       }
//     }
//     return start != 0 && end != A.length-1 && start == end;
//   }