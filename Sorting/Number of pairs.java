

class Solution {
    
    static long countPairs(int x[], int y[], int M, int N) {
        Arrays.sort(y);

        int[] countY = new int[5];
        for (int i = 0; i < N; i++) {
            if (y[i] < 5) {
                countY[y[i]]++;
            }
        }
        
        long totalPairs = 0;
        for (int i = 0; i < M; i++) {
            totalPairs += countForX(x[i], y, countY, N);
        }
        
        return totalPairs;
    }

    static long countForX(int x, int[] y, int[] countY, int N) {
        if (x == 0) return 0;
        if (x == 1) return countY[0];
        
        int pos = upperBound(y, x);
        long count = N - pos;

        count += countY[0] + countY[1];
        
        if (x == 2) count -= (countY[3] + countY[4]);
        if (x == 3) count += countY[2];
        
        return count;
    }

    static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
