class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here  
        int res = 1;
        while(m >= 0 && n >= 0) {
            if(m % 2 == n % 2) {
                res++;
            }
            else {
                return res;
            }
            m = m / 2;
            n = n / 2;
            if(n == 0 && m == 0) return -1;
        }
        return res + 1;
            
    }
}
