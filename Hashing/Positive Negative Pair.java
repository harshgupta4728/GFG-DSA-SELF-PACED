class Solution {
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (set.contains(-num)) {
                result.add(-Math.abs(num));
                result.add(Math.abs(num));
            }
            set.add(num);
        }
        
        return result;
    }
}
