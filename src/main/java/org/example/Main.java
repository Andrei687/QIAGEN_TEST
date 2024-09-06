package org.example;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Pascal Triangle

        System.out.println(PascalTriangle(0, 2));
        System.out.println(PascalTriangle(1, 2));
        System.out.println(PascalTriangle(1, 3));

        System.out.println(PascalTriangle(2, 4));
        System.out.println(PascalTriangle(1, 4));
        System.out.println(PascalTriangle(4, 4));

        // Parentheses Balancing

        System.out.println(ParenthesesBalancing(List.of(':', '-', ')')));
        System.out.println(ParenthesesBalancing(List.of(':', '-', '(', ')')));
        System.out.println(ParenthesesBalancing(List.of()));
        System.out.println(ParenthesesBalancing(List.of('(', 'i', 'f', ' ', '(', 'z', 'e', 'r', 'o', '?', ' ', 'x', ')', ' ', 'm', 'a', 'x', ' ', '(', '/', ' ', '1', ' ', 'x', ')', ')')));
        System.out.println(ParenthesesBalancing(List.of('I', ' ', 't', 'o', 'l', 'd', ' ', 'h', 'i', 'm', ' ', '(', 't', 'h', 'a', 't', ' ', 'i', 't', '’', 's', ' ', 'n', 'o', 't', ' ', '(', 'y', 'e', 't', ')', ' ', 'd', 'o', 'n', 'e', ')', '.', ' ', '(', 'B', 'u', 't', ' ', 'h', 'e', ' ', 'w', 'a', 's', 'n', '’', 't', ' ', 'l', 'i', 's', 't', 'e', 'n', 'i', 'n', 'g', ')')));


        // to do unit tests
    }


    public static int PascalTriangle(final int c, final int r) {
        if (c > r || c < 0) {
            System.out.println("Bad example of columns: " + c + " and rows: " + r);
            return 0;
        }
        if (c == r || c == 0) {
            return 1;
        } else if (c == 1 || (c + 1) == r) {
            return r;
        }

        return PascalTriangle(c - 1, r - 1) + PascalTriangle(c, r - 1);
    }

    public static boolean ParenthesesBalancing(List<Character> listOfChars) {
        boolean result = false;
        int numberOfParentheses = 0;
        char lastParentheses = ')';

        if (listOfChars.isEmpty()) {
            System.out.println("The given list is empty!");
            return false;
        }

        for (Character listOfChar : listOfChars) {
            if (listOfChar == '(') {
                numberOfParentheses++;
                lastParentheses = listOfChar;
            } else if (listOfChar == ')') {
                numberOfParentheses--;
                lastParentheses = listOfChar;
            }
        }

        if (numberOfParentheses == 0 && lastParentheses == ')') {
            result = true;
        }

        return result;
    }
}