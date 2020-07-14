package StringExamples;

public class StrinExample {

    public static void main(String[] args) {


        String str1="this is a java"; // find character at 3 & length

        System.out.println("Length of the string is :"+str1.length());
        System.out.println("Character at index 3:"+str1.charAt(3));

        // String str2="hi i am here";   // find character at 2  & length

        String str2 = "hi i am here";
        System.out.println("Length Of String is : "+ str2.length());
        System.out.println("Character at Index 3 is "+str2.charAt(3));

        // find character at 0 &  length

        String str3="where are you";

        int strlength;
        char charAtPosition;

        strlength= str3.length();
        charAtPosition = str3.charAt(0);

        System.out.println("Length Of String is : " +strlength);
        System.out.println("Character at Index 0 is : "+charAtPosition);

        // find character at 5 & length

        String str4="this is a demo";
        int str4Length;
        char charAtIndexPo;

        str4Length = str4.length();
        System.out.println("The String Length is : "+ str4Length);

        charAtIndexPo = str4.charAt(5);
        System.out.println("Character at Index Position 5 is :" + charAtIndexPo);

        String str5="core java"; // find character at 6 & length

        System.out.println("The String Length is : "+str5.length());
        System.out.println("Character At Index Position 6 is : "+str5.charAt(6));
    }

}
