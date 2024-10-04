/*
Given an integer n, determine if it is a perfect number. A perfect number is defined as a number that is equal to the sum of its proper divisors (excluding itself).
*/

import java.util.Scanner;

public class Main {
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPerfect(n));
        
    }
}
