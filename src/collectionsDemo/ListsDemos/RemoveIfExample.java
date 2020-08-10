package collectionsDemo.ListsDemos;

import java.util.ArrayList;

public class RemoveIfExample {


    public static void main(String[] args) {


        ArrayList<Integer> alInt = new ArrayList<>();
        alInt.add(23);
        alInt.add(43);
        alInt.add(33);
        alInt.add(13);
        alInt.add(113);
        alInt.add(133);
        System.out.println(alInt);

        alInt.removeIf(a -> a<20);

        System.out.println(alInt);


        ArrayList<Character> alChar = new ArrayList<>();

        alChar.add('a');
        alChar.add('m');
        alChar.add('o');
        alChar.add('l');
        alChar.add('p');
        alChar.add('r');
        alChar.add('i');
        alChar.add('y');
        alChar.add('k');

        // remove all vowels elements a,e,i,o,u
        System.out.println(  alChar);
        alChar.removeIf(ch->ch=='a'|| ch=='u' || ch=='e' || ch=='i' || ch=='o');

        System.out.println(  alChar);

    }


}
