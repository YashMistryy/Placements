import java.util.Arrays;

class incInt{
    public static void main(String[] args) {
        int[] nums = {9,9,9};
        int carry = 1;
        // for (int i = nums.length-1; i >=0; i--) {

        //     // nums[i] = nums[i] + carry;
        //     int x = nums[i]+carry; 
        //     System.out.println(x);
        //     if(x >= 10){
        //         nums[i] = x%10;
        //         carry = x/10;
        //     }else{
        //         nums[i] += carry;
        //         carry= 0;
        //     }
        // }
        // for (int i = nums.length-1; i >=0; i--) {
        //     if(nums[i]<9){
        //         nums[i] = nums[i]+1;
        //         return nums;
        //     }
        //     nums[i] = 0;
        // }
        // int[] res = new int[nums.length+1];
        // res[0] = 1;
        // return res;
        // System.out.println(Arrays.toString(nums));

            String str = "yash mistry";
            int i=0;
            int j = str.length()-1;
            char tmep;
            char[] charArr = str.toCharArray();
             while(i<j){
                tmep = charArr[i];
                charArr[i] = charArr[j];
                charArr[j] = tmep;
                i++;
                j--;        
             }
             System.out.println(new String(charArr));


    }
}