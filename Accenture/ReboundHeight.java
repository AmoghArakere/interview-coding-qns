/*
Daniel has a ball. He wants to find the ball's rebound height, which he dropped from height H with an initial velocity V. After the N* rebound the final velocity of the ball is V, Your task is to help him find and return an integer value representing the height to which the ball rebounds after N bounces.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter the initial height H: ");
        int H = scanner.nextInt();

        System.out.print("Enter the initial velocity V: ");
        int V = scanner.nextInt();

        System.out.print("Enter the final velocity Vn: ");
        int Vn = scanner.nextInt();

        System.out.print("Enter the number of bounces N: ");
        int N = scanner.nextInt();

        // Calculate the coefficient of restitution e
        double e = (double) V / Vn;

        // Calculate the rebound height after N bounces
        int reboundHeight = (int) (H * Math.pow(e, 2 * N));

        // Print the result
        System.out.println("The rebound height after " + N + " bounces is: " + reboundHeight);
        
        scanner.close();  // Close the scanner to prevent resource leaks
    }
}
