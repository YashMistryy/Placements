package DS_ALGO.Strings;


public class IfPalindrome {
    static boolean checkIfPalindrome(String word){
        int n = word.length();
        int start = 0; // the first element
        int end = n-1; // the last element
// lets convert string to character array for parsing
char[] charArr = word.toCharArray();
        while(start<end){
          if(charArr[start]!=charArr[end]){
              return false;}
              start++;
              end--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("wasitacaroracatisaw"));
    }
}
