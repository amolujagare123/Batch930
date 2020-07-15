package StringExamples;

public class SpitStringDemo {


    public static void main(String[] args) {

        String str = "Hi this is a engineering";

        String[] stArr = str.split(" ");
//        String[] stArr = str.split("i");

        for(int i=0;i<stArr.length;i++) {
            System.out.println(stArr[i]);
        }

    }

    // IN ABOVE STRING PRINT ONLY THE WORDS THAT ENDS WITH  's'

}
