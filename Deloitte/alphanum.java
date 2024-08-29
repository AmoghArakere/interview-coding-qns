/*
In input Alpha numeric string is given.
Our task is to form the string of indexes where in numbers appear in input string.
Test Case 1:
Input: ABC65D19HY09
Output: 34671011
*/

import java.util.Scanner;

public class AppendIndexOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input string
        String str = scanner.nextLine();
        
        StringBuilder ans = new StringBuilder();
        
        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a digit
            if (ch >= '0' && ch <= '9') {
                // Append the index of the digit to the result
                ans.append(i);
            }
        }
        
        // Output the concatenated result
        System.out.println(ans.toString());
    }
}
