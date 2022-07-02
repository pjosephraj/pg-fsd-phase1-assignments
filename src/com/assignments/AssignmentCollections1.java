package com.assignments;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class AssignmentCollections1 {
    public static void main(String[] args) {

        LinkedHashSet L1 = new LinkedHashSet();

        L1.add(100);
        L1.add(150);
        L1.add(20.00f);
        L1.add(60.00f);
        L1.add("V");
        L1.add("S");
        L1.add(true);

        System.out.println("LinkedHashSet Generic L1: " + L1);

        LinkedHashSet L2 = new LinkedHashSet<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers randomly from 1 to 8:");

        for (var i = 0; i < 8; i++) {
            Integer num = Integer.valueOf(input.nextLine());
            L2.add(num);
        }

        System.out.println("LinkedHashSet Integers L2: " + L2);

    }
}
