/*
You are given a string as which contains the moves played by the players. Sequentially in a game called snake water gun. The rules of the game are as follows.
Snake beats water, water beats gun and gun beats snake.
The move played by player, A and move played by player B in the first round will be stored in the string as "snakewater".
B
Similarly, in the second round, the moves will be stored in a string as "snakewatergunsnake".
There are total N rounds that are played in the game and your task is to find and return an integer value representing how many rounds player A wins.
Enter the string: snakewatergunwatergunsnake
Count: 2
*/

import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String n = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < n.length(); ) {
            char a = n.charAt(i);
            if (a == 's' || a == 'w') {
                i += 5;
            } else {
                i += 3;
            }

            if (i >= n.length()) {
                break; // To avoid out-of-bounds access
            }

            char b = n.charAt(i);
            if (b == 's' || b == 'w') {
                i += 5;
            } else {
                i += 3;
            }

            if ((a == 's' && b == 'w') || 
                (a == 'w' && b == 'g') || 
                (a == 'g' && b == 's')) {
                count++;
            }
        }

        System.out.println("Count: " + count);
        scanner.close();
    }
}
