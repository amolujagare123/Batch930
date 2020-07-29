package MethodsReturningValues;

import java.util.Date;

public class ReturningValues {

    int myMethod()
    {
        int x =89;
        //return 23;
        return x;

    }


    int myMethod1()
    {

        int a = 10;
        int b =20;

        return (a+b);

    }

    int myMethod2()
    {


        return (10+2);

    }


    double getMyDouble()
    {
        double d = 10.2;

        return  d;
    }


    char getMychar()
    {
        char c = 'h';

        return  c;
    }

    String getMyString()
    {
        String  str ="amol";

        return  str;
    }

    // home work  - return substring
    // write a method that takes string as argumnet and returns
    // the string without its first character


    Date getMydate()
    {
        Date date = new Date();

        return date;
    }

    Date getMydate1()
    {


        return new Date();
    }



    void display()
    {
        System.out.println("display");
    }


    public static void main(String[] args) {
        ReturningValues ob = new ReturningValues();

        int y = ob.myMethod();
        System.out.println(y);
        System.out.println(ob.myMethod());

        System.out.println(ob.myMethod1());
        System.out.println(ob.myMethod2());


        Double db = ob.getMyDouble();
        System.out.println(db);
        System.out.println(ob.getMyDouble());

        char ch = ob.getMychar();
        System.out.println(ch);
        System.out.println(ob.getMychar());


        String ss  = ob.getMyString();
        System.out.println(ss);
        System.out.println(ob.getMyString());


        System.out.println(ob.getMydate1());


    }


}
