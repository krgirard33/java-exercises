package exercises;

public class AddEven {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 97, 22, 44};

        for(int number : numbers) {
            if (number % 2 == 0){
                System.out.print(number + ", ");
            }
        }
    }
}
