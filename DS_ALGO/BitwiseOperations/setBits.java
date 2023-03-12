package BitwiseOperations;

public class setBits {
    public static void main(String[] args) {
        // set i'th bit of a number to 1
        // ans  : | or with bitmask for that bit
        // n = 5 then left shift 1 with 4 to get bitmask = 10000

        int n  = 15 ;
        int bitmask = (1<<2);
        int complBitmask = ~bitmask;
        System.out.println( n & complBitmask);
    }
}
