package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static String ONION = "onion";

    private static List<String> deleteOnion(String... array) {
        List<String> list = new ArrayList<>();

        for (String str : array) {
            if (!ONION.equals(str)) {
                list.add(str);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        print(deleteOnion("orange", "plum", "tomato", "onion", "grape", "onion"));
    }

    private static void print(List<String> strings) {
        int i = 1;

        for (String str : strings) {
            System.out.println(i + " " + str);
            i++;
        }
    }
}
