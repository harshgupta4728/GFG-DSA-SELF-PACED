class Solution{
    public int digitsInFactorial(int N){
        // code here
        if (N < 0) {
            return 0; // Factorial is not defined for negative numbers
        }
        
        if (N <= 1) {
            return 1; // Factorial of 0 or 1 is 1, which has 1 digit
        }
        
        double digitCount = 0;
        for (int i = 2; i <= N; i++) {
            digitCount += Math.log10(i);
        }
        
        return (int) Math.floor(digitCount) + 1;
    }
}