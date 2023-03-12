package BitwiseOperations;

public class oddOrEven {
    // using bitwise operator determine a number as even or odd

    public static void main(String[] args) {
        int  n = 90;
        if((n & 1) == 1)
        System.out.println("its odd");
        else
        System.out.println("its even");
    }
}
