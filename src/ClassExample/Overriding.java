package ClassExample;

public class Overriding { // parent

    void myMethod()
    {
        System.out.println("Overriding:I am in my method / parent");
    }
}

class ChildOverriding extends Overriding // child
{
    void myMethod()
    {
        System.out.println("ChildOverriding:I am in my method / child");
    }

    public static void main(String[] args) {

        ChildOverriding ob = new ChildOverriding();
        ob.myMethod();

        // if you are calling an overridden method with the child class object then
        // the preference is given to the own class method

        Overriding ob1 = new ChildOverriding(); // upcasting
        ob1.myMethod();








    }

}