package org.arick;

import lombok.extern.slf4j.Slf4j;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@Slf4j
public class HelloWorld {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        LOG.info("Simple Logging Message");
        System.out.printf("Hello and welcome!%n");

        // Press ⌃R or click the green arrow button in the gutter to run the code.
        for (int iteration = 1; iteration <= 5; iteration++) {

            // Press ⌃D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing ⌘F8.
            System.out.println("iteration = " + iteration);
        }
    }
}
