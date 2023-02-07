import java.util.ArrayList;
import java.util.HashMap;

public class intersectArrays {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int[] nums1 = {4,5,6};
        int[] nums2 = {1,2,3,4,6};

        for (int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }
//      we have put all the element of nums1 in map
//      now check the common elements by comparing
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                map.put(nums2[i],map.get(nums2[i]-1));
                arr.add(nums2[i]);

                     }
        }
        System.out.println(arr);

    }
}
