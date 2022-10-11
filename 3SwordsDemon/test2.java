import java.util.Arrays;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArr = new int[9];
        int a ;
        int count = 0;
        for (int i = 0; i < myArr.length; i++) {
            a = in.nextInt();
            if(a != 0){
              myArr[i] = a;
              count++;
            }
            else{
                break;
            }
        }
        System.out.println("length"+count);
        System.out.println("capacity"+myArr.length);
        System.out.println(Arrays.toString(myArr));



    }



}
