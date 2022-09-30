package com.yash;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // string builder
    // helps to create mutable string objects in java

    // StringBuilder sb = new StringBuilder("roronoa zoro");
    // sb.insert(0,"Pirate hunter , ");
    // sb.delete(14,24);
    // System.out.println(sb);
        
    // reversing a string using string builder

//     StringBuilder myStr = new StringBuilder("this is my string!");

//     int i = 0;
//     int j = myStr.length() -1;
//     char temp = 0;
//    while(i<j){
//     temp = myStr.charAt(i);
//     myStr.setCharAt(i, myStr.charAt(j)); 
//     myStr.setCharAt(j, temp);
//     i++;
//     j--;
//    }

//    System.out.println(myStr);

// bitwise operators

// bitwise and &
// int a = 7;
// int pos = 2;
// int bitmask = 1<<pos;

// if( (bitmask&a) == 0){
//     System.out.println("bit : 0");
// }else{
//     System.out.println("bit : 1");
// }

// bitwise or 
// int num = 5;
// int pos = 1;
// int bitmask = 1<<pos;

// System.out.println(bitmask|num);

// bitwise setting bit clearing the bit
int num =7;
int pos = 1;
int bitmask = 1<<pos;
int notBitmask = ~(bitmask);

System.out.println(notBitmask & num);



}













 

}
