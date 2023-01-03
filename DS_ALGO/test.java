import java.util.Arrays;
import java.util.List;

public class test implements MyInterface,MySecondInt{
  public static void main(String[] args) {
  
  }

@Override
public void display() {
    // TODO Auto-generated method stub
    
}

@Override
public void printItem() {
    // TODO Auto-generated method stub
    
}

@Override
public void printingPress() {
    // TODO Auto-generated method stub
    
}
    
}
interface MyInterface implements MySecondInt{
    int raju = 0;
    void display();
    void printItem();
  
}
interface MySecondInt{
    void printingPress();
}