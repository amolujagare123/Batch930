package collectionsDemo.wrapperclassesDemo;

public class UnboxingDemo {

    public static void main(String[] args) {


        Integer ii = new Integer(6); // non premitive object

        // conversion of non premitive into premitive
        // is called as unboxing or unwrapping

        int i1 = ii.intValue(); // here we converted non premitive into premitive

        int i2 = ii ;// autounboxinbg or auto unwrapping


        Double dd = new Double(34.6);

        double d = dd.doubleValue();  // here we converted non premitive into premitive

        double d1 = dd ; // autounboxinbg or auto unwrapping

        for(Integer i=0; i<10;i++)
        {
            System.out.println( i );
        }

    }
}
