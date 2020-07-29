package FinalStaticKeyword;


import static FinalStaticKeyword.StaticMethodDemo.myMethod;

public class CounterDemo {

    static int count =0;

    CounterDemo()
    {
        count++; // 1
        System.out.println(count); // 1
    }

    public static void main(String[] args) {
        CounterDemo ob1 = new CounterDemo(); //ob1.count
        CounterDemo ob2 = new CounterDemo();//ob2.count
        CounterDemo ob3 = new CounterDemo();//ob3.count


       //StaticMethodDemo.myMethod();
        myMethod();
    }
}
