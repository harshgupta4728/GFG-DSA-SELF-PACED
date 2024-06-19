class Solution {

    public long factorial(int N) {
        // Your code hereint 
        
        long fact=1;
       for(int i=2;i<=N;i++){
           fact=fact*i;
       }
        return fact;
    }
}