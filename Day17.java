public Day17{
    int findMaxSum(int arr[], int n) {
        

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return arr[0];
        }

        if (n == 2) {
            return Math.max(arr[0], arr[1]);
        }

        // dp[i] represents the maximum sum of non-adjacent elements ending at index i
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            // Choose whether to include the current element or skip it
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }

        return dp[n - 1];
    }

}