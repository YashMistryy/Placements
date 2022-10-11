package DS_ALGO.Array;
public class FindEvenDigitNums {
    public static void main(String[] args) {
        int[] nums = {12,3232,13131,23,465,67,68686,686,866,686,68,68,67676};
        System.out.println(findEvenDigitNums(nums));
    }
    static int findEvenDigitNums(int[] arr){
        int count = 0;
        int digitCount = 0;
        for (int i : arr) {
            while(i>=0){
                i = i/10;
                digitCount++;
           }
           if(digitCount%2 == 0)count++;
        }
        return count;
    }
    
}
