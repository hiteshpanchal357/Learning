public class Animal {
    
    //Object variable
    String name ;

    //constructor
    Animal(String name){
        
        this.name = name;
        System.out.println("Animal constructor called");

    }

    // Method
    void sound(){
        System.out.println("Animal makes sound");

    }
}

class Dog extends Animal{

    Dog(String name){
        super(name);
        System.out.println("Dog constructor called");

    }

    // method overriding same name, same parameter
    @Override
    void sound(){
        System.out.println("Dog barks");

    }
}
