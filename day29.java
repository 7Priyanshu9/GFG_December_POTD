import java.util.*;
public class day29{
    int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here   
     if (n % k != 0) return 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i += k) {
            String substr = s.substring(i, i + k);
            map.put(substr, map.getOrDefault(substr, 0) + 1);
        }
        if (map.size() == 1) return 1;
        if (map.size() != 2) return 0;
        for (int count : map.values()) {
            if (count == 1 || count == n / k - 1) return 1;
        }
        return 0;
    }
}