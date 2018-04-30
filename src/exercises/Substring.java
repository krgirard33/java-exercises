package exercises;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // Takes an input from user and checks if it is in a string
        String longline = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner Searchterm = new Scanner(System.in);
        System.out.print("What do you seek? ");
        String term = Searchterm.nextLine();
        Boolean found;

        // Simple statement
        found = longline.contains(term);
        System.out.println("It is " + found + " that " + term + " is in the text.");

        // Trying out an if else
        if (found) {
            System.out.println(term + " is contained in " + "["+longline+"]");
        } else System.out.println(term + " was not found.");
    }
}
