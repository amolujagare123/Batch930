package pack1;

public class hierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Dog1 dog1 = new Dog1();
        dog1.bark();
        dog1.eat();

        Cat cat = new Cat();

        cat.meow();
        cat.eat();
    }
}


class Animal1
{
    void eat()
    {
        System.out.println("Aniamal Eats");
    }
}

class Dog1 extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");

    }
}

class Cat extends  Animal1
{
    void meow()
    {
        System.out.println("Cat meow");

    }
}