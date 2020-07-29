package FinalStaticKeyword;

public class StaticMethodDemo {

    int a ;
    static int b;

    public static void display()
    {

    }

    public static void myMethod()
    // static methods can access only static data members directly
    // if you want to access the non static members create the object of the class and then access
    {
        System.out.println("inside My method");
        StaticMethodDemo ob = new StaticMethodDemo();
        System.out.println("a="+ob.a);
        System.out.println("b="+b);

        display();

    }


  static {

      System.out.println("i am in static block");

    }




    public  static int returningMethod()
    {
        int a;

        a =10;

        return a;
    }

   /* public static void main(String[] args) {
        StaticMethodDemo ob = new StaticMethodDemo();
        ob.a=10;
        ob.b=20;

        StaticMethodDemo.myMethod(); // static methos can be called using just the class name

    }*/
}
