package ClassExample;

public class ParamertsDemo {

    int a;
    int b;
    int c;


    void display()
    {
        System.out.println("a="+a+", b="+b+" , c="+c);
    }

    void addition(int x , int y)
    {
        c=x+y;
    }


    public static void main(String[] args) {
        /*ParamertsDemo ob = new ParamertsDemo();
        ob.a =10;
        ob.b=20;

        ob.display();*/


        ParamertsDemo ob1 = new ParamertsDemo();
        ob1.addition(12,22);
        ob1.display();

    }

}
