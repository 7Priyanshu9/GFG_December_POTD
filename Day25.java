public class Day25{
    static int determinantOfMatrix(int matrix[][], int n)
    {
    if (n == 1) {
        return matrix[0][0];
    }

    int det = 0;
    int sign = 1;
    for (int i = 0; i < n; i++) {
        int[][] subMatrix = new int[n - 1][n - 1];
        getCofactor(matrix, subMatrix, 0, i, n);
        det += sign * matrix[0][i] * determinantOfMatrix(subMatrix, n - 1);
        sign = -sign;
    }
    return det;
}

public static void getCofactor(int[][] matrix, int[][] temp, int p, int q, int n) {
    int i = 0, j = 0;
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < n; col++) {
            if (row != p && col != q) {
                temp[i][j++] = matrix[row][col];
                if (j == n - 1) {
                    j = 0;
                    i++;
                }
            }
        }
    }
}
}
