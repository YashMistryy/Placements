import java.util.Arrays;
import java.util.List;

public class test implements MyInterface{
  public static void main(String[] args) {
    System.out.println("helooo");
    MyInterface.display(23);
  }
    
}
interface MyInterface{
   static void display(int a){
        
        System.out.println("interface method called"+a);
    }
}