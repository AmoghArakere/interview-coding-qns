/*
Arnab has given me a challenge. I have to calculate the number of numbers which are less than a certain value n, and have exactly k set bits in its binary form. As you are a Prepster like me, help me write a code that will take input for n and k and give the expected output.
Constraints:
1<=n<=10000
1<=k<=10
*/
import java.util.Scanner;

public class CalculateMomentum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int momentum = 0;

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int v = scanner.nextInt();
            momentum += m * v;
        }

        System.out.println(momentum);
        scanner.close();
    }
}

  
