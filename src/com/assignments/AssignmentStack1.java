package com.assignments;

import java.util.Stack;

public class AssignmentStack1 {
    public static void main(String[] args) {

        int int1 = 1;
        int int2 = 2;
        int int3 = 3;
        int int4 = 4;

        Stack stack = new Stack();

        stack.add("Apple");
        stack.add("Mango");
        stack.add("Banana");
        stack.add("Jackfruit");
        stack.add("Grapes");

        stack.add("Delhi");
        stack.add("Mumbai");
        stack.add("Chennai");
        stack.add("Bengaluru");

        stack.add(int1);
        stack.add(int2);
        stack.add(int3);
        stack.add(int4);

        stack.add("A");
        stack.add("B");

        System.out.println("Stack: " +  stack);

        for(int i = 0; i < 5; i++) {
            stack.pop();
        }

        System.out.println("Stack removed 5 elements: " +  stack);

        System.out.println("Stack Peek Element: " + stack.peek());

        for(int i = 0; i < 2; i++) {
            stack.pop();
        }

        System.out.println("Stack removed 2 elements: " +  stack);

        stack.remove(7);
        stack.remove(6);

        System.out.println("Stack removed Last 2 elements: " +  stack);

        System.out.println("Stack First Element: "+ stack.firstElement());

        System.out.println("Apple Index: " + stack.indexOf("Apple"));

        System.out.println("Apple Index: " + stack.indexOf("Delhi"));
    }
}
