class Solution {
    public int majorityWins(int arr[], int n, int x, int y) {
        int countX = 0, countY = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                countX++;
            else if (arr[i] == y)
                countY++;
        }
        
        if (countX > countY)
            return x;
        else if (countY > countX)
            return y;
        else
            return Math.min(x, y);
    }
}
