import java.util.HashSet;

public class Day10 {
      static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            // Check if the current sum has been seen before
            if (set.contains(sum) || sum == 0) {
                return true;
            }

            // Add the current sum to the HashSet
            set.add(sum);
        }

        // No subarray with 0 sum found
        return false;
    }
}

