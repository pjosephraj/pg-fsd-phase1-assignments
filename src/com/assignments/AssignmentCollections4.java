package com.assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class AssignmentCollections4 {

    public static void main(String[] args) {
        Map<Integer, String> lhs = new LinkedHashMap<Integer, String>();

        lhs.put(1, new String("Apple"));
        lhs.put(2, new String("Orange"));
        lhs.put(3, new String("Banana"));
        lhs.put(4, new String("Mango"));
        lhs.put(5, new String("Grapes"));
        lhs.put(6, new String("Pomegranate"));
        lhs.put(7, new String("Mango"));
        lhs.put(8, new String("Strawberry"));
        lhs.put(9, new String("Papaya"));
        lhs.put(10, new String("Watermelon"));

        System.out.println("Fruits" + lhs);

        for (Integer key : lhs.keySet()) {
            System.out.println(key + ": " + lhs.get(key));
        }

        lhs.remove(4, "Mango");
        lhs.remove(7);

        System.out.println("Fruits: " + lhs);

        Boolean isExist = lhs.containsValue("Banana") && lhs.containsValue("Apple");

        System.out.println("Is Banana & Apple exist: " + (isExist ? "Yes" : "No"));

        System.out.println("Is Fourth key exist: " + (lhs.containsKey(4) ? "Yes" : "No"));

        System.out.println(lhs.hashCode());

        lhs.clear();

        System.out.println("Hashmap cleared: " + lhs);
    }
}
