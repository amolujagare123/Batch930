package ClassExample;

public class AnotherparameterDemo {

    void getString(String str)
    {
        System.out.println(str); // string as argumnet
    }

    void getCharacter(char c)
    {
        System.out.println(c); // character as argument
    }

    void getArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

    void  multipleArguments(int a, String str , char c)
    {
        System.out.println("a="+a+", str="+str+", c="+c);
    }

    public static void main(String[] args) {

        AnotherparameterDemo ob = new AnotherparameterDemo();

        ob.getString("this is a string");
        ob.getCharacter('g');

        int[] b = {23,56,78,12,54,87};

        ob.getArray(b);

        ob.multipleArguments(12,"amol",'b');


        System.out.println("hell world"); // string as an argument


    }


}
