/*
Given a string you are requested to determine whether the string should be converted to all uppercase or all lowercase, depending on the count of uppercase and lowercase letter in that string.
Example 1: AbCdEfG
Output 1: ABCDEFG
Example 2: xYz
Output 2: xyz
*/

import java.util.Scanner;

public class Main {
    public static void solve(String str) {
        int upper = 0;
        int lower = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upper++;
            } else {
                lower++;
            }
        }
        
        if (upper > lower) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        solve(str);
        
    }
}
