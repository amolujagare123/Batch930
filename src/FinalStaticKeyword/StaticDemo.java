package FinalStaticKeyword;

public class StaticDemo {
    int rollno;
    String name;
    public static String college="XYZ";

    void display()
    {
        System.out.println("Roll no:"+rollno);
        System.out.println("name:"+name);
        System.out.println("college:"+college);
    }

    public static void main(String[] args) {

        StaticDemo ob = new StaticDemo();
        ob.rollno =12;
        ob.name="Praful";
        ob.college = "PICT";

       // ob.display();

        StaticDemo ob1 = new StaticDemo();
        ob1.display();


        System.out.println(college);

        /*StaticDemo ob2 = new StaticDemo();
        ob2.rollno =13;
        ob2.name="Priyanka";
        //ob2.college = "My college";

        ob2.display();


        System.out.println("collge name printed withot object");
        System.out.println(StaticDemo.college);*/

        System.out.println(college);


    }
}
