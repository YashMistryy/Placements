package Strings;

import java.util.HashMap;

public class FirstUniqChar {
    public static void main(String[] args) {
        String str = "yy";
        char[] charArr =str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            if(map.containsKey(charArr[i])){
                map.put(charArr[i],map.get(charArr[i])+1);
            }
            map.put(charArr[i],1);
        }
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(map.get(charArr[i]));
        }
        System.out.println(map);
    }
}
