/*
Create a program that takes a number as input, calculates the sum of digits at odd positions and even positions separately, and then finds their difference.
Enter a number (up to 100 digits): 4567
Output: 2
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (up to 100 digits): ");
        String input = scanner.nextLine();

        int result = calculateDifference(input);
        System.out.println("Output: " + result);
    }

    public static int calculateDifference(String number) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            if (i % 2 == 0) {
                oddSum += digit;  // odd position
            } else {
                evenSum += digit;  // even position 
            }
        }

        return Math.abs(oddSum - evenSum);
    }
}
