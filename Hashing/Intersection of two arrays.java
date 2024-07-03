class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setA.add(a[i]);
        }

        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(b[i]);
        }

        // Perform intersection operation
        setA.retainAll(setB);

        // Return the size of the intersection set
        return setA.size();
    }
}
