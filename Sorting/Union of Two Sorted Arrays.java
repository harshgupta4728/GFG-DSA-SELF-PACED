class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            // Skip duplicates in arr1
            while (i > 0 && i < n && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j > 0 && j < m && arr2[j] == arr2[j - 1]) {
                j++;
            }

            if (i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    unionList.add(arr1[i]);
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    unionList.add(arr2[j]);
                    j++;
                } else {
                    unionList.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        // Add remaining elements of arr1
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                unionList.add(arr2[j]);
            }
            j++;
        }

        return unionList;
    }
}
