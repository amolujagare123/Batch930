package pack1;

public class MyClass {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        
        Dog dog = new Dog();
        dog.bark();
        dog.eat(); // from Animal class

        Babydog babydog = new Babydog();
        babydog.weeps();
        babydog.bark(); // from Dog class
        babydog.eat(); // from Amimal class


    }
}


class Animal
{

    void eat()
    {
        System.out.println("Aniamal Eats");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");

    }
}

class Babydog extends Dog
{

    void weeps()
    {
        System.out.println("Baby Dog weeps");

    }

}