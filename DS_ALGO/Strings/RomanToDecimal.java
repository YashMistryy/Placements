package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class RomanToDecimal {
    public static void main(String[] args) {
       System.out.println(getDecimalVal("XI")); 
    }

    private static int getDecimalVal(String s) {

        HashMap<Character,Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        // System.out.println(romans);
        char[] carr = s.toCharArray();
        int temp = 0;
        int result = 0;
        for (int i = 0; i < carr.length; i++) {
            if(i>0 && romans.get(carr[i-1])< romans.get(carr[i])){
                temp += romans.get(carr[i]);
                hold = 1;
            }
            else{
                result += romans.get(carr[i+1]);
            }
        }
        
        
        return result-temp;
    }
}
