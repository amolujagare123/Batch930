package FinalStaticKeyword;

public class FinalVariableDemo {

    final int count =10 ; // constant

    void changecount()
    {
      //    count = 20; //Error : Cannot assign a value to final variable 'count'
    }

    public static void main(String[] args) {
        FinalVariableDemo ob = new FinalVariableDemo();

        ob.changecount();

        System.out.println(ob.count);
    }
}
