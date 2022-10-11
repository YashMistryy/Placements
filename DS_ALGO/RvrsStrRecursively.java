package com.yash;

public class RvrsStrRecursively {
    public static void main(String[] args) {
        String myStr = "this should be it";
        reverseStrRecursively(myStr.length()-1,myStr);
    }
    static void reverseStrRecursively(int charAt, String str){
        if(charAt<0){
            return;
        }
        System.out.print(str.charAt(charAt));
        reverseStrRecursively(charAt-1, str);
    }
}
