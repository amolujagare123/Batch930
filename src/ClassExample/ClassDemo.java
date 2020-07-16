package ClassExample;

public class ClassDemo {

    int i;
    double d;
    String str;
    char c;

    public void display()
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("str="+str);
        System.out.println("c="+c);
    }

    public static void main(String[] args)
    {
        ClassDemo ob = new ClassDemo();

        ob.i=89;
        ob.d=34.6;
        ob.c= 'h';
        ob.str= "xyz";

        ob.display();
    }

}
