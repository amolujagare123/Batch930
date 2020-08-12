package collectionsDemo.ListsDemos;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("amol");
        stack.push("chaitanya");
        stack.push("praful");
        stack.push("Sandeep");
        stack.push("Priyanka");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // System.out.println(stack);

        System.out.println(stack);

        if(stack.contains("amol"))
            System.out.println("this is by praful");

        // peek , empty , search

        // peek - just returns the element not remove

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());



    }
}
