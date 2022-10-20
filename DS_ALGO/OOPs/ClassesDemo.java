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
        Wrapper classes
            java has wrapper classes which allows us to use primitive data types as Objects
            eg. we can create an integer with Integer class which will have many properties 
            that primitive int doesnt have.
        


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