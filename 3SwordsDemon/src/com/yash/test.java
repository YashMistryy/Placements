package com.yash;

public class test {
    public static void main(String[] args) {
        findOccurence("it is the string which descreibes something meaningful", 't');
    }
    static void findOccurence(String str , char ch){
    int i = 0;
    int j = str.length()-1;

    while(i<str.length()){
        if(str.charAt(i) == ch){
          System.out.println("the first occurence at : "+i);
          break;
        }
       
        else{
            i++;
        }
    }
    while(j>=0){
        if(str.charAt(j) == ch){
            System.out.println("the last occurence : "+j);
            break;
        }
        j--;
    }
    }
}
