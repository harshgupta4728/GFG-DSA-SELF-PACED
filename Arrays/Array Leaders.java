class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> leadersList = new ArrayList<>();

        // The rightmost element is always a leader.
        int maxFromRight = arr[n - 1];
        leadersList.add(maxFromRight);

        // Traverse the array from the second last element to the first.
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leadersList.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // The leadersList will be in reverse order, so reverse it.
        Collections.reverse(leadersList);
        return leadersList;
    }
}
