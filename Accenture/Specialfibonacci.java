/*Input: Given a, b, n. Find the value of f(n) where :
﻿﻿f(0) = a
﻿﻿f(1) = b
﻿﻿f(n) = f(n-1) xor f(n-2) Output :
﻿﻿Print the value of f(n). Xor use*/

import java.util.Scanner;

public class FindFofN {
    public static int findF(int a, int b, int n) {
        if (n % 3 == 0) {
            return a;
        } else if (n % 3 == 1) {
            return b;
        } else {
            return a ^ b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for n: ");
        int n = scanner.nextInt();
        
        // Finding the value of f(n)
        int result = findF(a, b, n);
        
        // Printing the result
        System.out.println("The value of f(" + n + ") is: " + result);
    }
}
  /*
Enter value for a: 2
Enter value for b: 3
Enter value for n: 5
The value of f(5) is: 1
  */
