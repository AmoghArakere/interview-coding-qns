/*
A googly prime number is defined as a number that is derived from the sum of its individual
digits. For example, if N = 43, the sum of its individual digits is 4+3 = 7, which is prime
making it a googly prime number. 4
Your task is to find whether the current number is googly prime number or not.
*/
import java.util.Scanner;

public class GooglyPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a googly prime number
        if (isGooglyPrime(number)) {
            System.out.println(number + " is a googly prime number.");
        } else {
            System.out.println(number + " is not a googly prime number.");
        }

        scanner.close();
    }

    // Method to check if the number is a googly prime number
    public static boolean isGooglyPrime(int number) {
        int sumOfDigits = sumDigits(number);
        return isPrime(sumOfDigits);
    }

    // Method to find the sum of the digits of the number
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
