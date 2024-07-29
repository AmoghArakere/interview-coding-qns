/*Two players A and B are playing the game of Rock, Paper and scissors. Player A chooses a move represented by String M and the move can be one of the following :
Rock, paper or scissors where
Rock beats scissors
Scissor beats paper
Paper beats rock
Your task is to find and return a string value representing the winning move for B.

Input 1 : rock
Output 1 : paper

Input 2: scissor
Output 2: rock*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerA = scanner.nextLine();
        
        if (playerA.equals("rock")) {
            System.out.println("paper");
        } else if (playerA.equals("paper")) {
            System.out.println("scissors");
        } else {
            System.out.println("rock");
        }
      }
}
