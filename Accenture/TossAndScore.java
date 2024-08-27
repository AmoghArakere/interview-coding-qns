/*A game called "Toss and Score" being played at the Hillwood City Mall. Here's a summary of the game rules and the corresponding Java implementation:

Rules:
1. Toss an unbiased coin multiple times.
2. For each heads, you get 2 points. For each tails, you lose 1 point.
3. The game ends when you get 3 heads in a row or when you toss the coin throughout the length of string S.

Task: Find and return an integer value representing the final score once the game ends.*/

public class Main {
    public static int tossAndScore(String S) {
        int score = 0;
        int countHeads = 0;
        
        for (int i = 0; i < S.length(); i++) {
            char toss = S.charAt(i);
            
            if (toss == 'H') {
                score += 2;
                countHeads += 1;
            } else {
                score -= 1;
                countHeads = 0;
            }
            
            if (countHeads == 3) {
                break;
            }
        }
        
        return score;
    }

    public static void main(String[] args) {
        System.out.println(tossAndScore("HTHHTTHTHHHT"));
        // System.out.println(tossAndScore("TTTHHTT"));
    }
}
