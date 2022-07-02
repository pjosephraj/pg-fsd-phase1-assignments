package com.assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class AssignmentCollections3 {
    public static void main(String[] args) {

        String winterMonth = "December";
        LinkedList ll = new LinkedList<String>();

        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("April");
        ll.add("November");
        ll.addLast("December");
        ll.addFirst("January");
        ll.add(1, "March");
        ll.add(1, "February");
        ll.add(7, "September");
        ll.add(8, "October");
        ll.remove("April");
        ll.add(3, "April");

        System.out.println("Months: " + ll);

        Iterator itr = ll.iterator();
        String evenMonths = "";
        String oddMonths = "";
        String allMonths = "";
        int idx = 0;

        while (itr.hasNext()) {
            var month = itr.next();

            if(idx % 2 == 0) {
                oddMonths += " | " + month;
            } else {
                evenMonths += " | " + month;
            }
            allMonths += " | " + month;
            idx++;
        }

        System.out.println("Even Months: " + evenMonths);
        System.out.println("Odd Months: " + oddMonths);
        System.out.println("All Months: " + allMonths);
        System.out.println("First Month: " + ll.getFirst() + ", Last Month: " + ll.getLast());
        System.out.println("Birthday Month: " + ll.remove(9));
        System.out.println("Contains winter month: " + (ll.contains(winterMonth) ? "Yes" : "No"));
        System.out.println("First Month: " + ll.peekFirst());
        System.out.println("Last Month: " + ll.peekLast());
        System.out.println("Removed First Month: " + ll.pollFirst());
        System.out.println("Removed Last Month: " + ll.pollLast());
        System.out.println("Final List of Months: " + ll);
    }
}
