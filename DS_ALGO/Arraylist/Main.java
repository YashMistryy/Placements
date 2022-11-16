package Arraylist;

import java.util.ArrayList;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
    public static void main(String[] args) {
        // arraylist in java
        // it is similar to list in python
        // we do not have to declare the size of arraylist 
        // It rather changes or increase its size to double to store more values
        // ArrayList myList = new ArrayList<>();
        // myList.add(12);
        // myList.add("name is yash");
        // System.out.println(myList);
        try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            try{
                int a = 3/0;

            }catch(Exception e2){
                e2.printStackTrace();
                System.out.println("this was caught inside CATCH block!");
            }
            System.out.println("some arithmetic problem occured!");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("generic exception occured!");
        }finally{
            System.out.println("this will be executed no matter what!");
        }
    }
}
