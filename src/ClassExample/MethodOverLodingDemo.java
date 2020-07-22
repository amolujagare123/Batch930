package ClassExample;

public class MethodOverLodingDemo {

    void sum(int a,int b)
    {
        System.out.println(a+b);
    }

    void sum(double a,double b)
    {
        System.out.println(a+b);
    }

    void sum(double a,int b)
    {
        System.out.println(a+b);
    }

    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    void sum(String str1,String str2)
    {
        System.out.println(str1+str2);
    }

    public static void main(String[] args) {
        MethodOverLodingDemo ob = new MethodOverLodingDemo();

        ob.sum(23,45);
        ob.sum(23,67,45);
        ob.sum("selenium","Cucumber");
        ob.sum(23.5,67.4);
        ob.sum(23.5,78);
    }
}
