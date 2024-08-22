import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Get the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the maximum number
        int max = (num1 > num2) ? num1 : num2;

        // Display the maximum number
        System.out.println("The maximum number is: " + max);

        // Close the scanner
        scanner.close();
    }
}
