import java.util.Arrays;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int max = 0;
        int localmax = 0;
        int[] myArr = {1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0,1,0,1,1,1,1,0,1};
        for (int i : myArr) {
            if(i == 1){
            localmax++;    
            }
            else{
                localmax = 0;
            }
            if(max < localmax){
                max = localmax;
            }
        }


        System.out.println(Arrays.toString(myArr));
        System.out.println("max consecutive ones "+max);
    }
    
}
