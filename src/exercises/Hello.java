package exercises;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner Person = new Scanner(System.in);
        System.out.print("Enter your name? ");
        String name = Person.nextLine();

        System.out.print("Hello " + name);
    }
}
