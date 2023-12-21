import java.util.Arrays;
public class Day21{
    static int minCandy(int N, int ratings[]) {
        // code here
        int n = ratings.length;
        int[] candies = new int[n];

        // Initialize each child with 1 candy
        Arrays.fill(candies, 1);

        // Iterate from left to right, assign more candies to the right if the rating is higher
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Iterate from right to left, consider the decreasing order and update candies
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up the total candies needed
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;

    }
}