/*
The problem statement involves calculating the number of numbers less than a given value n that have exactly k set bits (i.e., bits with value 1) in their binary form. The input consists of two integers n and k, and the output is the number of such numbers.
*/
import java.util.Scanner;

public class SetBitsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values for n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        
        // Iterating through all numbers from 1 to n-1
        for (int i = 1; i < n; i++) {
            // Count the number of set bits in the binary representation of i
            if (Integer.bitCount(i) == k) {
                count++;
            }
        }
        
        // Output the result
        System.out.println(count);
    }
}
