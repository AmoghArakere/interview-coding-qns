/*Given a number 𝑁 your task is to make N a single digit number by performing the following operations:
If N is ODD, make it floor(𝑁/2)
If N is even, make it floor((𝑁−2)/2)
If N is already a single digit, print it as it is.*/

import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    
    while (N > 9) {
        if (N % 2 == 1) {
           
            N = N / 2;
        } else {
            
            N = (N - 2) / 2;
        }
    }
    
    System.out.println(N);
        
    }
}

