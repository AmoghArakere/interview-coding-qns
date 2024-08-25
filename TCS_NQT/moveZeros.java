/*
A chocolate factory is packing chocolates into packets. The chocolate packets here represent an array of N number of integer values. The Task is to find the empty packets(0) of chocolate and push it to end of the conveyer belt.
Enter the size of the array: 4
Enter the elements of the array:
0 4 0 3
After: 4 3 0 0 
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        
        System.out.print("After: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
