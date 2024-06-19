class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
         int count = 0;
        for(int k = 0; k <= 32; k++) {
            if( (a & (1 << (k-1))) != (b & (1 << (k-1))) ) count++;
        }
        return count;
        
    }
    
    
}
