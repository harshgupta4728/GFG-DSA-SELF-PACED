class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        if(n == 0) return 0;
        int res = 1;
        while(n > 0) {
            if(n % 2 != 0) return res;
            else res ++;
            n = n / 2;
        }
        return res;
            
    }
}
