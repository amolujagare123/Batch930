package ClassExample;

public class ClassDemo {

    int i;
    double d;
    String str;
    char c;

    ClassDemo() // empty contructors
    {
         // no body
    }

    /*ClassDemo() // normal constructors
    {
      i =10;
      d= 1.1;
      str="abcd";
      c='s';
    }*/

   /* ClassDemo(int x,double y,String ss ,char cc) // parameterized constructor
    {
        i =x;
        d=y;
        str=ss;
        c=cc;

    }*/

    ClassDemo(int i,double d,String str ,char c) // parameterized constructor with 'this'operator
    {
        this.i =i; // 'this' refers to current object
        this.d=d;
        this.str=str;
        this.c=c;

    }

    ClassDemo(ClassDemo obj) // copy constructor
    {
        i=obj.i;
        d=obj.d;
        str=obj.str;
        c=obj.c;

    }

    public void display() // function / method
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("str="+str);
        System.out.println("c="+c);
    }

    public static void main(String[] args)
    {

        ClassDemo ob = new ClassDemo(12,23.5,"amol",'h'); // instance of the class
        ob.display();

        ClassDemo ob1 = new ClassDemo();
        ob1.display();

    }

}
