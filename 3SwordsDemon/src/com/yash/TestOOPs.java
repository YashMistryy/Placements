package com.yash;

abstract class Animal{
}
class Horse extends Animal{
    public void walks(){
        System.out.println("walks on 4 legs");
    }
}
class Seal extends Animal{
    public void swims(){
        System.out.println("dont walk but swim with 2 fins");
    }
}
public class TestOOPs {
    public static void main(String[] args) {
        
        Horse chetak = new Horse();
        chetak.walks();


        

    }



}
