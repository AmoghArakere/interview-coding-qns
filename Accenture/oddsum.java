/*
An odd number is an integer which is not a multiple of 2.
You are required to implement the following function:
Int SumOddIntegers(int arr[], int n);
The function accepts an integer array ‘arr’ of length ‘n’ as its argument. You are required to
calculate the sum of all odd integers in an array ‘an’ and return the same.
Note:
Array can have negative integers
n > 0
*/

import java.util.Scanner;

public class Main {

    public static int SumOddIntegers(int arr[], int n) {
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sumOdd += arr[i];
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = SumOddIntegers(arr, n);
        System.out.println(result);
    }
}
