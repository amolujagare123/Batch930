package FinalStaticKeyword;

public class FinalMethodDemo {

    final void display()
    {
        System.out.println("this is display method:FinalMethodDemo");
    }

}

class ChildFinal extends FinalMethodDemo
{
    /*void display() // 'display()' cannot override 'display()' in 'FinalKeyword.FinalMethodDemo'; overridden method is final
    {
        System.out.println("this is display method:ChildFinal");
    }*/

}


