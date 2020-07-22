package pack1;

public class Java1 {

   public  int i1;
   private double d1;
    protected  String str1;
    char c1;

    public void display1() // function / method
    {
        System.out.println("i="+i1);
        d1 =90.2;
        System.out.println("d="+d1);
        System.out.println("str="+str1);
        System.out.println("c="+c1);
    }



    public static void main(String[] args)
    {
        Java1 ob = new Java1();
        ob.i1=10;

        ob.str1 = "assa";
        ob.d1 =78.3;

    }
}

/*

class AnotherClass
{
    public static void main(String[] args)
    {
        Java1 ob = new Java1();
        ob.i1=10;

     //   ob.d1 =78.3;

    }
}
*/
