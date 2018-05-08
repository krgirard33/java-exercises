package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static main(String[] args) {
        String words = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget " +
                "massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = words.toCharArray();
        HashMap<Character, Integer> counted = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newChar;

        for ( char i : charactersInString ) {
            counted.put(i, counted.getOrDefault(i, 1) + 1);
            }
            for (char i : counted) {
            System.out.println(i + ":" + counted.get())
        }




        }



        }

    }
}
