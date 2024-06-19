class Solution{
    
    //  Function to find the gray code of given number n
    public static int greyConverter(int n) {
        
        // Your code here
        return n ^ (n >> 1);
        
    }
    
}
