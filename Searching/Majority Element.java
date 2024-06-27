class Solution {
    static int majorityElement(int a[], int size) {
        // Phase 1: Find the candidate for majority element
        int candidate = findCandidate(a, size);

        // Phase 2: Verify if the candidate is actually the majority element
        if (isMajority(a, size, candidate)) {
            return candidate;
        } else {
            return -1;
        }
    }

    // Function to find the candidate for majority element
    static int findCandidate(int[] a, int size) {
        int count = 0, candidate = -1;
        for (int num : a) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    // Function to check if the candidate is the majority element
    static boolean isMajority(int[] a, int size, int candidate) {
        int count = 0;
        for (int num : a) {
            if (num == candidate) {
                count++;
            }
        }
        return count > size / 2;
    }
}
