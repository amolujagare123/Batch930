package collectionsDemo.wrapperclassesDemo;

public class WrapperClassConstructors {

    public static void main(String[] args) {


        Integer ii = new Integer(3);
        System.out.println(ii);

        Integer ii1 = new Integer("45");
        System.out.println(ii1);

        System.out.println(ii+ii1);

        float f= 236.34f;
        double d = 34.54;

        Float ff1 = new Float(f);
        System.out.println(ff1);

        Float ff2 = new Float(d);
        System.out.println(ff2);

        Float ff3 = new Float("23.5f");
        System.out.println(ff3);

        Float ff4 = new Float("23.5");
        System.out.println(ff4);

        System.out.println("Sum of decimals:"+(ff1+ff2+ff3+ff4));


        Character cc = new Character('v');
        System.out.println(cc);

       // Character cc1 = new Character("c");

        // how to convert a single character string (for e.g. "f") into character

        Boolean bb = new Boolean(true);
        Boolean bb1 = new Boolean("true");

        if(bb)
            System.out.println("bb is boolean");

        if(bb1)
            System.out.println("bb1 is String");










    }

}
