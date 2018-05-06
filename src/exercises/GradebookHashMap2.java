package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GradebookHashMap2 {
    public static void main(String[] args) {

        HashMap<Integer, String> studentids = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ids
        do {
            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = in.nextInt();
                studentids.put(newID, newStudent);
                // Read in the newline before looping back
                in.nextLine();
            }
        }
        while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : studentids.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());

        }

        System.out.println("Number of students: " + studentids.size());
    }
}
