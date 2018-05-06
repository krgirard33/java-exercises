package org.launchcode.java.exercises;

public class FiveLetters {
    public static void main(String[] args) {
        String[] words = new String[] {"Boy", "Woman", "Cheeses", "Chess", "Picture", "yourself", "in", "a",
                "boat", "on", "a", "river", "With", "tangerine", "trees", "and", "marmalade", "skies"};

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
