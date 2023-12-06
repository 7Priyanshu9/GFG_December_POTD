public class Day6 {
    int countX(int L, int R, int X) {
        int count = 0;

      for (int i = L + 1; i < R; i++) {
          count += countOccurrencesInNumber(i, X);
      }

      return count;
  }

  private static int countOccurrencesInNumber(int number, int X) {
      int count = 0;

      while (number > 0) {
          if (number % 10 == X) {
              count++;
          }
          number /= 10;
      }

      return count;
  }
}
