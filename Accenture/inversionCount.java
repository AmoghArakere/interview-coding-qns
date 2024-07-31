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

import java.util.*;

public class Main {

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int cnt = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    public static int numberOfInversions(int[] a, int n) {
        return mergeSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int cnt = numberOfInversions(a, n);
        System.out.println(cnt);
    }
}

