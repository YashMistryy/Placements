package BitwiseOperations;

public class findBits {
    public static void main(String[] args) {
        // find i'th bit of a number
        // ans  : & with bitmask for that bit
        // n = 5 then left shift 1 with 4 to get bitmask = 10000
        int n  = 12344;
        int bitmask = (1<<6);
        System.out.println( n & bitmask);
    }
}
