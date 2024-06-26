class Solution {
    public int[] solve(int N, int a[]) {
        int repeating = -1;
        int missing = -1;
        
        // Step 1: Find the repeating number by marking visited elements
        for (int i = 0; i < N; i++) {
            int absValue = Math.abs(a[i]);
            if (a[absValue - 1] < 0) {
                repeating = absValue;
            } else {
                a[absValue - 1] = -a[absValue - 1];
            }
        }
        
        // Step 2: Find the missing number
        for (int i = 0; i < N; i++) {
            if (a[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        
        return new int[] {repeating, missing};
    }
}
