class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
        int countFromOne = 1;
        int previousBit = 0;
        int currentBit = 0;
        ArrayList<Integer> totalConsecutives = new ArrayList<Integer>();
        for(int k=1; k <= 32; k++) {
            if( (n & (1 << (k-1))) == 0) {
                currentBit = 0;
            } else {
                currentBit = 1;
            }
            if(currentBit == 1 && previousBit == 1) countFromOne++;
            if(currentBit != previousBit && countFromOne > 1) {
                totalConsecutives.add(countFromOne);
                countFromOne = 1;
            }
            previousBit = ((n & (1 << (k-1))) == 0) ? 0 : 1;
        }
        if(currentBit == 1 && previousBit == 1 && countFromOne > 1) totalConsecutives.add(countFromOne);
        int max = totalConsecutives.size() == 0 ? 1 : Collections.max(totalConsecutives);
        return max;
        
    }
}
