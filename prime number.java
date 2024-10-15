import java.util.Scanner;

public class PrimeNumberCheck {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // If divisible, it's not a prime number
            }
        }

        return true;  // If no divisors found, the number is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the function and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
