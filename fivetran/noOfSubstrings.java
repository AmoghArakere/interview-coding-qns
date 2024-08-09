//Given a binary representation of a number, determine the total number of substrings present that match the following conditions: 
//zeros and ones are grouped consecutively, and the number of zeros and ones are equal.
public class Solution {
    public static int countNoOfSubstrings(String binaryString) {
        if (binaryString == null || binaryString.length() < 2) {
            return 0;
        }

        int count = 0;
        int previousCount = 0;
        int currentCount = 1;

        for (int i = 1; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == binaryString.charAt(i - 1)) {
                currentCount++;
            } else {
                previousCount = currentCount;
                currentCount = 1;
            }

            if (previousCount >= currentCount) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String binaryString1 = "00110011";
        System.out.println("Total substrings with equal consecutive 0s and 1s: " +
            countNoOfSubstrings(binaryString1));  // Output: 6

        String binaryString2 = "10101";
        System.out.println("Total substrings with equal consecutive 0s and 1s: " +
            countNoOfSubstrings(binaryString2));  // Output: 4
    }
}
