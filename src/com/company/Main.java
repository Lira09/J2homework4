package com.company;

import javax.swing.plaf.nimbus.State;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the state ");
        int values = scanner.nextInt();

        System.out.println("Enter the name of the states ");
        ArrayList<String> states = new ArrayList<>(values);
        while (values > states.size()) {
            states.add(scanner.next());
        }

        print(states);


        System.out.println("_______________");


        ArrayList<String> states1 = new ArrayList<>(values);
        while (values > states1.size()) {
            states1.add(scanner.next());
        }

        Collections.reverse(states1);
        print(states1);


        System.out.println("______________");

        ArrayList<String> states3 = new ArrayList<>(values);
        int i = 0;
        while (states3.size() < states.size() + states1.size()) {
            states3.add(states.get(i));
            states3.add(states1.get(i));
            i++;
        }
        print(states3);


        Collections.sort(states3, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        print(states3);
    }

    public static void print(ArrayList<?> list) {
        System.out.println("------------------------------");
        Iterator<String> iterator = (Iterator<String>) list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


