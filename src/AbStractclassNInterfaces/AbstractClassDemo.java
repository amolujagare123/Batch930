package AbStractclassNInterfaces;

public abstract class AbstractClassDemo {

     abstract void start(); // abstract methods
    abstract  void run();

    void  display() // non abstract method - concrete methods
    {
        System.out.println("inside display");
    }
}

class ChildofAbStractClass extends AbstractClassDemo
{
    public void start()
    {
        System.out.println("inside start");
    }

    void run()
    {
        System.out.println("inside run");
    }

    public static void main(String[] args) {
        ChildofAbStractClass ob = new ChildofAbStractClass();

        ob.start();
        ob.run();
        ob.display();
               
        AbstractClassDemo abstractObject = new ChildofAbStractClass();

        abstractObject.start();
        abstractObject.run();
        abstractObject.display();
    }



}
