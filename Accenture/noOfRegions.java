/*
Mr. Professor needs to find the maximum number of regions created when N straight lines that are not parallel and no three lines go through the same point.
Input Specification:
input1: An integer N representing the number of straight lines (0 <= N <= 100)
Output Specification:
Return the maximum number of regions
*/
import java.util.Scanner;

public class Main {

    public static int maxRegions(int N) {
        long result = ((long) N * N + N + 2) / 2;
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(maxRegions(N));
    }
}
