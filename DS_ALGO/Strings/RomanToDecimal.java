package Strings;

import java.util.HashMap;

public class RomanToDecimal {
    public static void main(String[] args) {
       System.out.println(getDecimalVal("MCMXCIV")); 
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
        int hold =0;
        int result = 0;
      
        for (int i = 0; i < carr.length-1; i++) {
            if(romans.get(carr[i])<romans.get(carr[i+1])){
                result -= romans.get(carr[i]);
            }else{
                result+= romans.get(carr[i]);                   
            }
        }
        
        return result+romans.get(carr[carr.length-1]);
    }
}
