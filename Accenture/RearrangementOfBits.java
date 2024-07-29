/*Alex Gives You a positive Number N and wants you to rearrange the bits of the number in its binary representation such that all set bits are in consecutive order.
Your task is to find and return an integer value representing the minimum possible number that can be formed after re-arranging the bits of the number N.
Input 1:
10
Output 1:
3*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        
        // 2 set bits = 2^0*1 + 2^1*1 = 3
        int ans = 0;
        int power = 1;
        
        for (int i = 0; i < count; i++) {
            ans += power * 1;
            power = power * 2;
        }
        
        System.out.println(ans);
    }
}
