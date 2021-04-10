package com.company;

import javax.swing.plaf.nimbus.State;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        Iterator<String> iterator = states.iterator();
        System.out.println("Enter the name of the state ");
        Scanner scanner = new Scanner(System.in);

        states.add(scanner.next());
        states.add(scanner.next());
        states.add(scanner.next());
        states.add(scanner.next());
        states.add(scanner.next());

        Collections.sort(states);
        print(states);

        ArrayList<String> states1 = new ArrayList<>();
        Iterator<String> iterator1 = states1.iterator();
        states1.add(scanner.next());
        states1.add(scanner.next());
        states1.add(scanner.next());
        states1.add(scanner.next());
        states1.add(scanner.next());



        Collections.sort(states1);
        Collections.reverse(states1);
       print(states1);

        ArrayList<String> states3 = new ArrayList<>();
        int i =0;
        while (states3.size() < 9){
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
    public static void print(ArrayList <?> list){
        System.out.println("------------------------------");
    Iterator<String> iterator = (Iterator<String>) list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


