package ClassExample;

public class SuperForDataMember {

    SuperForDataMember()
    {
        System.out.println("Constructor : SuperForDataMember()");
    }

    String color = "Red";

    void eat()
    {
        System.out.println("eat() : SuperForDataMember");
    }

}


class ChildOfSuper extends  SuperForDataMember
{
    ChildOfSuper()
    {
        //super();
        System.out.println("Constructor : ChildOfSuper()");
    }


    String color = "Orange";
    void eat()
    {
        System.out.println("eat() : ChildOfSuper");
    }

   void getAllMethods()
   {
       eat();
       super.eat();
   }


    void getColors()
    {
        System.out.println(color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        ChildOfSuper ob = new ChildOfSuper();

      //  ob.getColors();

        //ob.getAllMethods();
    }
}