package pack2;

import pack1.Java1;

public class java3 extends Java1 {
    int i3;
    double d3;
    String str3;
    char c3;

    public void display3() // function / method
    {
        System.out.println("i="+i3);
        System.out.println("d="+d3);
        System.out.println("str="+str3);
        System.out.println("c="+c3);
    }



    public static void main(String[] args)
    {
        Java1 ob = new Java1();
        ob.i1=10;
      //  ob.str1 = "assa";


        java3 ob1 = new java3();
        ob1.i3 =12;

        ob1.i1 =12;
        ob1.str1= "hjhj";

    }
}
