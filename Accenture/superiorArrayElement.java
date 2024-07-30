/*
In an array, a superior element is one which is greater than all elements to its right. The rightmost element will always be considered a superior element.
You are given a function:
int FindNumberOfSuperiorElements(int* arr, int n);
The function accepts an integer array arr and its length n. Implement the function to find and return the number of superior elements in array arr.
Assumptions:
1. 𝑁>0
2. Array index starts from 0.
Example:
Input: Arr = [7, 9, 5, 2, 8, 7]
Output: 3
*/

import java.util.Scanner;

public class Main {

    public static int FindNumberOfSuperiorElements(int[] arr, int n) {
        
        int count = 0;
        int maxRight = arr[n - 1];

        count++;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                count++;
                maxRight = arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(FindNumberOfSuperiorElements(arr, n));
    }
}

