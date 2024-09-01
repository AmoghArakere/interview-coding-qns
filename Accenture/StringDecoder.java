/*
A string which has a sequence of 1s and Os. This sequence is the encoded version of a english word. You are supposed to write a program to decode the provided string and find the original word. Each uppercase Alphabet is representing by a sequence of 1s.
*/
public class StringDecoder {
    public static void main(String[] args) {
        // Example encoded string
        String encodedString = "101110111";

        // Decode the string
        String decodedString = decodeString(encodedString);

        // Print the decoded string
        System.out.println("Decoded String: " + decodedString);
    }

    public static String decodeString(String encoded) {
        StringBuilder decoded = new StringBuilder();
        String[] letters = encoded.split("0");  // Split the string by '0' to separate the letters

        for (String letter : letters) {
            int count = letter.length();  // Count the number of 1's
            char decodedChar = (char) ('A' + count - 1);  // Convert count to corresponding character
            decoded.append(decodedChar);
        }

        return decoded.toString();
    }
}
