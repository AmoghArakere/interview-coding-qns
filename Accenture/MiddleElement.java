/*Find the middle element of an array after ignoring all indices with negative numbers.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
      
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) {
                positiveNumbers.add(num);
            }
        }
        
        int midIndex = (positiveNumbers.size() - 1) / 2;
        System.out.println(positiveNumbers.get(midIndex));
    }
}
