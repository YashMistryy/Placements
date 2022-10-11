package com.yash;
class Student{
    int rollNo;
    static String schoolName;
}
public class StaticKeyword {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student.schoolName = "AGT";
        System.out.println(s2.schoolName);
    }

    
}
