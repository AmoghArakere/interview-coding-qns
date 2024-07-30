/*
It is Edward's birthday today. His friends have bought him a huge circular cake. Edward wants to find out the maximum number of pieces he can get by making exactly 
𝑁 straight vertical cuts on the cake.
Your task is to write a function that returns the maximum number of pieces that can be obtained by making N number of cuts.

Note: Since the answer can be quite large, modulo it by 1000000007
Input Specification:
input1: An integer 𝑁 denoting the number of cuts.
Output Specification:
Return the maximum number of pieces that can be obtained by making 
𝑁 cuts on the cake.

Example:
Input: 4
Output: 11

Input: 1
Output: 2
*/

import java.util.Scanner;

public class Main {

    private static final int MOD = 1000000007;

    public static int maxPieces(int N) {
      //if a chord of a circle cuts n other chords then it will introduce (n+1) new parts ie ans = sum of n no. + 1
        long result = ((long) N * N + N + 2) / 2;
        return (int) (result % MOD);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(maxPieces(N));
    }
}

