class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double r = (double) B / A;
        
        // Step 2: Calculate the Nth term using the formula A * r^(N-1)
        double nthTerm = A * Math.pow(r, N - 1);
        
        // Step 3: Return the Nth term
        return nthTerm;
    }

}
