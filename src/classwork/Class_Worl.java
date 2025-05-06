package classwork;
import java.util.Scanner;

public class Class_Worl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;         // Get the last digit
            reversed = reversed * 10 + digit; // Append digit
            number = number / 10;            // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}

