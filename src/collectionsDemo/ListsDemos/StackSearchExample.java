package collectionsDemo.ListsDemos;

import java.util.Stack;

public class StackSearchExample {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("amol");
        stack.push("chaitanya");
        stack.push("praful");
        stack.push("Sandeep");
        stack.push("Priyanka");

        System.out.println(stack);

        System.out.println(stack.search("Sandeep"));
        System.out.println(stack.search("Sandp"));
    }
}
