/*Alice has to climb N stairs to reach top . In each step Alice can climb either 1 step or M steps. Find the minimum number of steps to reach the top.*
Input Format :
Input contains Two space separated integers Nand M.
Output format :
Contains integer, that represents minimum number of climbs required to reach top.
Constraints :
1<=N<=10^9
1<=M<=10^9
Input 1 :
5 2
Output 1 :
3*/

import java.util.Scanner;

public class Main {
    public static int totalJumps(int n, int m) {
        return (n / m) + (n % m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(totalJumps(n, m));
        
    }
}
