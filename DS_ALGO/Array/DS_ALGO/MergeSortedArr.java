package DS_ALGO;

import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        // merge two sorted arrays
        // m and n are numbers 0f element in nums1 and nums2
        int m = 3-1 , n = 4-1;

        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {1,2,5,6};
        int i = 6;
        while(n>=0 && m>=0){
            if(m>=0 && nums1[m]>nums2[n]){
                nums1[i--] = nums1[m--];
            }else{
                nums1[i--] = nums2[n--];
            }
        }
        System.out.println(Arrays.toString(nums1));
        

    }
}


// public void merge(int[] nums1, int m, int[] nums2, int n) {
//     int i = m+n-1;
//     m--;
//     n--;
//     while(n>=0 ){
//         if(m>=0 && nums1[m] > nums2[n]){
//             nums1[i--] = nums1[m--];
//         }else{
//             nums1[i--] = nums2[n--];
//         }
//     }
//     // while(m>0){
//     //     nums1[i--] = nums2[m--];
//     // }
//     while(n>0){
//         nums1[i--] = nums2[n--];
//     }
    
// }
