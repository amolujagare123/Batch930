package pack1;

public class Java2 extends Java1{

    int i2;
    double d2;
    String str2;
    char c2;

    public void display2() // function / method
    {
        System.out.println("i="+i2);
        System.out.println("d="+d2);
        System.out.println("str="+str2);
        System.out.println("c="+c2);
    }



    public static void main(String[] args)
    {
        Java1 ob = new Java1();
        ob.i1=10;

        Java2 ob1 = new Java2();
        ob1.c2 = 'g';
        ob.str1 = "assa";
              ob1.i1 =12;
              ob1.display1();

    }
}
