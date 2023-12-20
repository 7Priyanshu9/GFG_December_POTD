public class Day20{
    static int findWinner(int n, int A[]){
        // code here
        if(n%2==0) return 1;
        int val=0;
        for(int i=0; i<n; i++){
            val^=A[i];
        }
        return val==0?1:2;
    }
}