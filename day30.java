import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class day30{
    public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> h = new HashMap<>();
        for(String s: arr){
            h.put(s, h.getOrDefault(s,0)+1);
        }

        int max = 0;
        String winner = "";
        String[] Ans = new String[2];

        for(Map.Entry<String, Integer> p : h.entrySet()){
            int freq = p.getValue();
            String candidate = p.getKey();
            if (freq > max || (freq == max && (candidate.compareTo(winner)<0))) {
            Ans[0] =String.valueOf(freq);
            Ans[1]= candidate;                
        }
}

        return Ans ;

}
}
