class Solution {
    // Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i = 0;

        while (i < n - 1) {
            // Find the local minima (buy point)
            while ((i < n - 1) && (A[i + 1] <= A[i])) {
                i++;
            }
            if (i == n - 1) {
                break;
            }
            int buy = i++;

            // Find the local maxima (sell point)
            while ((i < n) && (A[i] >= A[i - 1])) {
                i++;
            }
            int sell = i - 1;

            ArrayList<Integer> interval = new ArrayList<>();
            interval.add(buy);
            interval.add(sell);
            result.add(interval);
        }
        return result;
    }
}
