public class Day18 {
    static int gameOfXor(int N , int[] A) {
        // code here
        if(N%2==0) {
        return 0;
        }
        int result = A[0];
        for(int i=2;i<N;i+=2) {
            result ^= A[i];
        }
        return result;
    }
}
