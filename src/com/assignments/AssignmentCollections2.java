package com.assignments;

import java.util.TreeSet;

public class AssignmentCollections2 {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        String tbr1 = "Cobol";
        String tbr2 = "Basic";

        ts.add("Fortran");
        ts.add(tbr1);
        ts.add("Pascal");
        ts.add("Python");
        ts.add(tbr2);
        ts.add("Java");

        System.out.println("Six Languages: " + ts);

        ts.remove(tbr1);
        ts.remove(tbr2);

        System.out.println("After removal of Two Languages: " + ts);

        ts.add("Node");
        ts.add("SQL");
        ts.add("Go");

        System.out.println("Added Three more Languages: " + ts);

        System.out.println("Is TreeSet contains Java: " + (ts.contains("Java") ? "Yes" : "No"));

        ts.clear();

        System.out.println("TreeSet after removal of it's elements: " + ts);
    }
}
