package Uzduotis_14;

import java.util.*;

public class Main {
    public static void main (String[] args)
    {
        Db<String> container = new Db<>();

        container.add("Labas1");
        container.add("Labas2");
        container.add("Labas3");
        container.add("Labas4");
        container.add("Labas5");
        container.add("Labas6");
        container.add("Labas7");
        container.add("Labas8");
        container.add("Labas9");
        container.add("Labas10");

        for (String element:container)
        {
            System.out.println(element);
        }
        System.out.println("*********************************");
        for (String element: container.reverseIterator)
        {
            System.out.println(element);
        }


    }
}
