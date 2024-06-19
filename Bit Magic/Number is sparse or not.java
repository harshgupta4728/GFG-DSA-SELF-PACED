class Solution
{
    //Function to check if the number is sparse or not.
    public static boolean isSparse(int n)
    {
        // Your code here
        boolean flag = false;
        int previousBit = 0;
        int currentBit = 0;
        for(int k=1; k <= 32; k++) {
            if( (n & (1 << (k-1))) == 0) {
                currentBit = 0;
            } else {
                currentBit = 1;
            }
            if(currentBit == 1 && previousBit == 1) flag = true;
            previousBit = ((n & (1 << (k-1))) == 0) ? 0 : 1;
        }
        return flag ? false : true;
    }
    
}
