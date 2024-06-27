class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        if (N <= 1)
            return 0;
        
        int maxSteps = 0;
        int currentSteps = 1; // At least we can have a step with the first building
        
        for (int i = 0; i < N - 1; i++) {
            if (A[i] < A[i + 1]) {
                currentSteps++;
            } else {
                maxSteps = Math.max(maxSteps, currentSteps);
                currentSteps = 1; // Reset for the next sequence
            }
        }
        
        // Check the last sequence
        maxSteps = Math.max(maxSteps, currentSteps);
        
        return maxSteps - 1; // We need steps count, not the transitions count
    }
}
