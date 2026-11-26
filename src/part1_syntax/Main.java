package part1_syntax;

import common.Input;
/** Part 1. Types, arithmetic, strings, input/output and comments. */
public class Main {
    public static void main(String[] args) {
        int a = 17, b = 5;
        double price = 12.75;
        char initial = 'I';
        boolean learning = true;
        String subject = "Java programming";
        // Integer division discards the fractional part.
        System.out.printf("sum=%d difference=%d product=%d quotient=%d remainder=%d%n",
                a+b, a-b, a*b, a/b, a%b);
        System.out.println("Decimal division: " + (double)a/b);
        a++; b--;
        System.out.println("After increment/decrement: " + a + ", " + b);
        System.out.println("Cast double to int: " + (int)price);
        System.out.println("initial=" + initial + ", learning=" + learning);
        /* Strings are immutable: methods return a new value. */
        System.out.println(subject.toUpperCase());
        System.out.println("length=" + subject.length() + ", substring=" + subject.substring(0,4));
        String name = Input.text("What is your name? ");
        System.out.println("Hello, " + name + "!");
    }
}
