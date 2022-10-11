package com.yash;


public class FindOccurance {
    static int first = -69;
    static int last = -69;

    public static void main(String[] args) {
        String str = "this would be my string!";
        findOccurance( str, 'm',0);
        System.out.println("first :"+first+"  last:"+last);
    }

    private static void findOccurance(String str, char ch, int idx) {
        if(idx == str.length()){
            return;
        }
        if(str.charAt(idx) == ch){
            if(first == -69){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurance(str, ch, idx+1);

    }
    
}
