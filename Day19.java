public class Day19 {
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here      
        
        int num = m^n;
        int pos=0;
        while(num>0)
        {
            
            if(num%2==1)
            {
                return pos+1;
            }
            pos++;
            num/=2;
        }
        return -1;
            
    }
}
