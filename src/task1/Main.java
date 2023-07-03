package task1;

public class Main {
    private final static char CORRECT = 'o', WRONG = 'b';

    public static void main(String[] args) {
        print(string("brange", "plum", "tomato", "onibn", "grape"));
    }


    private static String[] string(String... array) {
        int length = array.length;
        String[] correct = new String[length];

        for (int i = 0; i < length; i++) {
            correct[i] = array[i].replace(WRONG, CORRECT);
        }
        return correct;
    }

    private static void print(String... array) {
        int i = 1;

        for (String str : array) {
            System.out.println(i + " " + str);
            i++;
        }
    }
}
