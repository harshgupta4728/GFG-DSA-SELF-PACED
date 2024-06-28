
class Solution
{
    // Function to return the maximum water that can be stored.
    static int maxWater(int height[], int n) 
    { 
        if (n < 2) return 0;

        int left = 0, right = n - 1;
        int maxWater = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int distance = right - left - 1;
            maxWater = Math.max(maxWater, minHeight * distance);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    } 
}
