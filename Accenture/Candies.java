/*
The problem is about Bob buying candies with specific conditions:
1. Bob wants to buy N candies.
2. The price of each candy is given in an array.
3. Bob has M amount of money.
4. If the price of a candy is a multiple of 5, Bob doesn't have to pay for it.
5. For the rest, Bob has to pay the exact amount mentioned in the array.

The goal is to return the maximum number of candies Bob can buy given these conditions.

*/
import java.util.Arrays;

public class CandyBuyer {
    public static int maxCandies(int[] prices, int M) {
        // Sort the prices array to maximize the number of candies bought
        Arrays.sort(prices);

        int count = 0;

        for (int price : prices) {
            if (price % 5 == 0) {
                // Candy is free, increment count
                count++;
            } else {
                // Check if Bob can afford this candy
                if (M >= price) {
                    M -= price;  // Deduct the price from the money
                    count++;     // Increment count of candies
                } else {
                    break;  // Bob can't afford more candies
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] prices = {3, 5, 7, 10, 11, 15};
        int M = 20;
        int maxCandies = maxCandies(prices, M);
        System.out.println("Maximum number of candies Bob can buy: " + maxCandies);
    }
}
/*
O/P :
Maximum number of candies Bob can buy: 4
*/
