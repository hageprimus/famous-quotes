package com.pluralsight;

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] quotes = {"quote1", "quote2", "quote3", "quote4", "quote5", "quote6", "quote7", "quote8", "quote9", "quote10"};
        String display = "Select a quote to display. (#1 - #10)\nEnter 100 for a random quote.\nEnter 0 to exit.";
        String userInput;
        int parsed;
        while (true) {
            userInput = getInputFromConsole(display, s, false);
            try {
                parsed = Integer.parseInt(userInput);
                if (parsed == 0) {
                    break;
                } else {
                    var index = parsed == 100 ? (int) (Math.random() * 10) : parsed - 1;
                    System.out.println(quotes[index]);
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
                e.printStackTrace();
            }
        }
        s.close();
    }

    public static String getInputFromConsole(String display, Scanner s, boolean clearBuffer) {
        if (clearBuffer) s.nextLine();
        System.out.println(display);
        return s.nextLine().trim();
    }
}
