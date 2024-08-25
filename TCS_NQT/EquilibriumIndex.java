/*
The problem requires finding an equilibrium index in an array of integers. An equilibrium index is defined as an index where the sum of elements on its left is equal to the sum of elements on its right. If no such index exists, the function should return -1.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int totalSum = 0;
        int leftSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        int equilibriumIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                equilibriumIndex = i;
                break;
            }
            leftSum += nums[i];
        }
        
        System.out.println("Equilibrium Index: " + equilibriumIndex);
    }
}
