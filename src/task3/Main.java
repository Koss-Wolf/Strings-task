package task3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final static String[] NAME = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

    private final static String NOT_LOCATED = "Name '%s' was not found", LOCATED = "Name '%s' was found %d time(s)";

    public static void main(String[] args) {
        String name = getName();
        print(name, findName(name));
    }

        private static String getName() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String name = "";

        while (name.length() < 1) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        }

        return capitalize(name);
    }


    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private static int findName(String name) {
        int i = 0;

        for (String el : NAME) {
            if (name.equals(el)) {
                i++;
            }
        }
        return i;
    }


    private static void print(String name, int num) {
        if (num == 0) {
            System.out.printf(NOT_LOCATED, name);
        } else  System.out.printf(LOCATED, name, num);

        System.out.println();
    }
}