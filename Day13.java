public class Day13 {
    long countStrings(int n) {
        // code here
          int[][] dp = new int[n + 1][2];
        int MOD = 1000000007;

        // Base cases
        dp[1][0] = 1; // Ending with 0
        dp[1][1] = 1; // Ending with 1

        // Fill the DP array for lengths 2 to N
        for (int i = 2; i <= n; i++) {
            // For a binary string ending with 0, the previous digit can be 0 or 1
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;

            // For a binary string ending with 1, the previous digit must be 0
            dp[i][1] = dp[i - 1][0];
        }

        // The answer is the sum of binary strings of length N ending with 0 or 1
        int result = (dp[n][0] + dp[n][1]) % MOD;

        return result;

    }
}
