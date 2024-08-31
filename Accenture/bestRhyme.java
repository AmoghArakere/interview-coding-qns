/*\
Given an array, String arr = {"gender", "blender", " blunder", "under"}
• Input string is " thunder". From the array return the word that rhymes the most with the given word. And if two words rhymes the most then return the word with less character count. (example in blunder and under, the output will be "under")
*/

public class RhymingWords {
    // Helper method to find the longest common suffix between two words
    private static String longestCommonSuffix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        int i = 0;
        while (i < minLength && s1.charAt(s1.length() - 1 - i) == s2.charAt(s2.length() - 1 - i)) {
            i++;
        }
        return s1.substring(s1.length() - i);
    }

    // Method to find the word that rhymes the most with the given input word
    public static String findBestRhyme(String[] arr, String input) {
        String bestRhyme = "";
        int maxSuffixLength = 0;
        
        for (String word : arr) {
            String suffix = longestCommonSuffix(word, input);
            int suffixLength = suffix.length();
            
            if (suffixLength > maxSuffixLength ||
                (suffixLength == maxSuffixLength && word.length() < bestRhyme.length())) {
                bestRhyme = word;
                maxSuffixLength = suffixLength;
            }
        }
        
        return bestRhyme;
    }

    public static void main(String[] args) {
        String[] arr = {"gender", "blender", "blunder", "under"};
        String input = "thunder";
        
        String result = findBestRhyme(arr, input);
        System.out.println("The word that rhymes the most with \"" + input + "\" is: " + result);
    }
}
