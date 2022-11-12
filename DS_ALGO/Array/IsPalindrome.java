import java.lang.annotation.Target;
import java.util.Arrays;

public class IsPalindrome {
   
    public static void main(String[] args) {
        // return indices 
        System.out.println((checkPali(-181)));
    }

    private static boolean checkPali(int N) {

        // check if integer(both positive and negative) is a palindrome or not
        // 1st approach is recursion
        // 2nd is iterative
        int result = 0;
        int temp = N;
        while(N>0){
            result  = result*10 + N%10;
            N = N/10;
        }
    
        if(result == temp)
        return true;
        return false;
    }
}
