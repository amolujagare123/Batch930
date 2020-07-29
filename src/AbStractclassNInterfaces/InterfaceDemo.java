package AbStractclassNInterfaces;

public interface InterfaceDemo {

    // by default data members are public in interface

    void display();
    void call();

    default void run()
    {
        System.out.println("run");
    }

    static void run1()
    {
        System.out.println("run1");
    }
}

class ChildInterfaceDemo implements  InterfaceDemo
{
    public void display()
    {
        System.out.println("display");
    }

    public void call()
    {
        System.out.println("call");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterfaceDemo();
        ob.call();
        ob.display();
        ob.run();

        InterfaceDemo.run1();


    }

}
