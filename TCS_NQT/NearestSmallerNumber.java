/*Enter the size of the array: 6
Enter the elements of the array:
1 6 4 10 2 5
Input:  [1, 6, 4, 10, 2, 5]
Output: [-1, 1, 1, 4, 1, 2]*/

import java.util.*;

public class NearestSmallerElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        System.out.println("Input:  " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
