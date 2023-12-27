import java.util.*;
public class Day27{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
          List<Integer> ansList = new ArrayList<>();
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = i;
            for (int j = 0; j <= i; j++) {
                ansList.add(matrix[row][col]);
                row++;
                col--;
            }
        }

        for (int i = 1; i < n; i++) {
            int row = i;
            int col = n - 1;
            for (int j = 0; j < n - i; j++) {
                ansList.add(matrix[row][col]);
                row++;
                col--;
            }
        }

        int[] ansArray = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ansArray[i] = ansList.get(i);
        }

        return ansArray;

    }
}