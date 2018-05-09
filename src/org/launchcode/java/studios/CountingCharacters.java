package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> counted = new HashMap<>();

        /* String words = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget " +
                "massa. Donec nec velit non ligula efficitur luctus.";
                */
        String words;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print("Please enter some words: ");
        words = in.nextLine();

        char[] charactersInString = words.toLowerCase().toCharArray();

        for (char i : charactersInString) {
            if (Character.isLetter(i)) {
                if (counted.containsKey(i)) {
                    counted.put(i, counted.get(i) + 1);
                } else {
                    counted.put(i, 1);
                }
            }
        }
        for (char c : counted.keySet()) {
            System.out.println(c + ":" + counted.get(c));
        }

    }

}
