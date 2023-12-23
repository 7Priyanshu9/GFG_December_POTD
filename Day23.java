import java.util.*;
public class Day23{
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int targetFrequency = n / k;

        // Step 1: Create a HashMap to store the frequency of each element
        Map<Integer, Integer> hm = new HashMap<>();

        // Step 2: Update the frequency count in the HashMap
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Step 3 and 4: Count elements with frequency greater than n/k
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > targetFrequency) {
                count++;
            }
        }

        return count;

    }
}