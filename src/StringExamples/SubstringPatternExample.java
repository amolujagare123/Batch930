package StringExamples;

public class SubstringPatternExample {

    public static void main(String[] args) {


        String str = "PRIYANKA";

        for (int i = 0; i < str.length();i++)
            System.out.println(str.substring(i) + str.substring(0,i));
    }
}
