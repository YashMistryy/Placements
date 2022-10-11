package com.yash;

public class RecursionDemo {
    static int sum=0;
    static int prev = 0;
    static int i = 0;
    static int total = 1;
    public static void main(String[] args) {
    // System.out.print(0+" "+1+" ");
    // printFibonacci(0,1,7);
    // System.out.println( printXpowerN(7,3));
    System.out.println(printXpowerNefficient(7, 4));
    }
    private static int printXpowerNefficient(int x , int n){
        System.out.println("method called");
        // base state
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // kaam
        if(n%2==0){
            // code if n is even
            return printXpowerNefficient(x, n/2)*printXpowerNefficient(x, n/2);
        }else{
            // code if n is odd
            return printXpowerNefficient(x, n/2)*printXpowerNefficient(x, n/2)*x;
        }
    }
    private static int printXpowerN(int x, int n) {
    // print x ^n
    System.out.println("method invocated onto stack!!1");
    if(n==0)
    return 1;
    return (x*printXpowerN(x, n-1));
    
    
    }
    private static void printFibonacci(int a, int b,int n) {
        if(n==2)
        return;
        int c = a+b;
        System.out.print(c+" ");
        printFibonacci(b, c, n-1);

    }
    private static int factOfNum(int i) {
        if(i==0)
        return 1;
        return (i*factOfNum(i-1));
    }
    private static int findSum(int i) {
        // if(i==0)
        // return; 
        // sum += i;
        // findSum(i-1);
        if(i==0 || i==1)
        return 0;
        return (i+findSum(i-1));
        
       
       
    }
    static void printNumbers(int num){
        if(num == 0)
        return;
        System.out.println(num);
        printNumbers(num - 1);
        System.out.println(num);
    }
}
