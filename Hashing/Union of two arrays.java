class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Create a HashSet to store elements of union
        HashSet<Integer> unionSet = new HashSet<>();
        
        // Add all elements from arr1 to unionSet
        for (int num : arr1) {
            unionSet.add(num);
        }
        
        // Add all elements from arr2 to unionSet
        for (int num : arr2) {
            unionSet.add(num);
        }
        
        // Return the size of unionSet which gives the count of distinct elements
        return unionSet.size();
    }
}
