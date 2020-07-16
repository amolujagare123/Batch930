package StringExamples;

public class StringComparison {


    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "dsdsd";
        String str5 = "sandeep";
        String str6 = "xyz";
        String str7 = new String("amol");

       // System.out.println(str1.equalsIgnoreCase(str7));




       /* System.out.println(str2.equals(str1));
        System.out.println(str3.equals(str1));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str6));*/



         System.out.println(str1==str2); // true

         System.out.println(str1==str7); // true,true,false




    }


}
