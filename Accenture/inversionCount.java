/*
Given an array A with indices j and k
If j < k and A[j] > A[k], the pair (j,k) is an "Inversion pair"
Implement a function: int InversionCount(int *A, int n)
The function should calculate and return the number of inversion pairs in array A
Function Specifications:
Input: Array 'A' of 'n' unique integers
Output: Number of inversion pairs
Notes:
If 'A' is NULL (None in Python), return -1
If 'n' < 2, return 0
Example:
Input: n = 5, A = [1, 20, 6, 4, 5]
Output: 5
Inversion pairs: (20,6), (20,5), (20,4), (6,4), (6,5)
*/

import java.util.Scanner;

public class Main {

    public static int InversionCount(int[] A, int n) {
        if (A == null) return -1;
        if (n < 2) return 0;

        int[] temp = new int[n];
        return mergeSortAndCount(A, temp, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] A, int[] temp, int left, int right) {
        int mid, invCount = 0;
        if (left < right) {
            mid = (left + right) / 2;

            invCount += mergeSortAndCount(A, temp, left, mid);
            invCount += mergeSortAndCount(A, temp, mid + 1, right);
            invCount += mergeAndCount(A, temp, left, mid, right);
        }
        return invCount;
    }

    private static int mergeAndCount(int[] A, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = A[i++];
        }

        while (j <= right) {
            temp[k++] = A[j++];
        }

        for (i = left; i <= right; i++) {
            A[i] = temp[i];
        }

        return invCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(InversionCount(A, n));
    }
}
