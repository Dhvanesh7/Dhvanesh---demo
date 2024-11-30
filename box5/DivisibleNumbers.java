package box5;
import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int userInput = scanner.nextInt();

        // Call the function to display the divisible numbers
        displayDivisibleNumbers(userInput);

        scanner.close();
    }

    // Function to display the last three-digit numbers divisible by 3 and 7
    static void displayDivisibleNumbers(int N) {
        for (int num = N - 1; num >= 100; num--) {
            if (num % 3 == 0 && num % 7 == 0) {
                System.out.println("Divisible number: " + num);
            }
        }
    }
}
