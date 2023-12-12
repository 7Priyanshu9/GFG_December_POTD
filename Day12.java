class Day12{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
         int rows = M.length;
        int cols = M[0].length;

        int[][] dp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            dp[i][0] = M[i][0];
        }

        for (int j = 1; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                int moveUp = (i > 0) ? dp[i - 1][j - 1] : 0;
                int moveRight = dp[i][j - 1];
                int moveDown = (i < rows - 1) ? dp[i + 1][j - 1] : 0;

                dp[i][j] = M[i][j] + Math.max(moveUp, Math.max(moveRight, moveDown));
            }
        }

        int maxGold = 0;
        for (int i = 0; i < rows; i++) {
            maxGold = Math.max(maxGold, dp[i][cols - 1]);
        }

        return maxGold;
    }
}