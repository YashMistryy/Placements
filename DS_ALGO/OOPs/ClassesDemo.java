package OOPs;

public class ClassesDemo {
    public static void main(String[] args) {
        // classses and objects

       /*classses
            classes are named group of functions and properties
            they are user defined datatype
            they are template to make objects 
            they are static and not implemented an does not take any space
            they are just rules and concept

        Objects
            initantiated class is know as object
            it is created from class template
            objects are created dyanmically at the runtime
            objects store data and hence occupy space in memory

        this keyword
            'this' keyword defines what objects's property or funtions is called
        '.' dot keyword
            '.' keyword is used to access function or property of classes or objects
        Constructor
            constructors are type of special function used to initialize or create an object
            constructors can be overloaded wiht parameters
        Destructor
            java dont have manual destructor.it does garbage collection and destroys objects when needed
        Wrapper classes
            java has wrapper classes which allows us to use primitive data types as Objects
            eg. we can create an integer with Integer class which will have many properties 
            that primitive int doesnt have.
        final keyword
            final keyword defines that the object is unchangeable
            final int a cannot be modified and if passed onto a function it will be 'pass by value' rather than 'pass by reference'.For primitive the immutabily holds up but for objects this changs.for objects the refernce cannot be changed but the value can be changed.eg final class obj = new class() , we cannot give some other refrence to this object obj like obj = new Other_class() but we can change value in the same object.
        Garbage collection
            It free up the space by destroying the objects when space is needed.it is used to increase efficiency.java doesn't support manual garbage collection rather it has a method finalize() to tell java what to do when garbage collecting is happening. C++ supports manual garbage collection
        Static keyword
            it allows us to use method and properties of a class without making an object of it.
            static varibles are not dependent on objects
        main method
            main method is the first thing that run when a java class is executed.
            we can have more than one main method
             a static method can only access a static data
            Package
            package is just a compartmentalised folder of classes.It stores classes in different folder apparently.
            
        


        *    
        */
        // Cat snowbell = new Cat();
        // // Dog rufus = new Dog();

        // Dog fluffy = new Dog(snowbell);
        // System.out.println(fluffy.sound);
        // System.out.println(fluffy.habitat);
        // System.out.println(fluffy.species_name);


        // System.out.println(snowbell.habitat);
        // System.out.println(rufus.sound);

        int a = 10;
        int b = 20;

        Integer x = 10;
        Integer y = 20;
        main(b);
    }
    public static void main(int x) {
        System.out.println(x*x);
    }
   
}
class Cat{
    String species_name;
    String habitat ;
    String sound;
    Cat(){
        this.habitat = "wild+domestic";
        this.sound = "meow..";
        this.species_name = "felines";
    }

}
class Dog{
    String species_name ;
    String habitat;
    String sound;
    Dog(){
        this.habitat = "wild+domestic";
        this.sound = "woofff..";
        this.species_name = "canines";
    }
    Dog (Cat cat){
        this.habitat = cat.habitat;
        this.sound = cat.sound;
        this.species_name = cat.species_name;
    }
}