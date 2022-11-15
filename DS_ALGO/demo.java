public class demo {
    public static void main(String[] args) {
    
      Animals animal1 = new Animals();
      animal1.age = 99;
      Dogs rufus = new Dogs();
      rufus.bark("rajesh");
    
    
    
    }
}
class Animals{
  int age;
  static String species = "mamals";
  static void printInfo(){System.out.println("hello how are you I am under the water!");}
}
class Dogs extends Animals{
  String species_name = "dog - cannines";
  void bark(){
    System.out.println("wooff----woooff");
  }
  void bark(String str){
    System.out.println("woof-----woof"+str);
  }
}