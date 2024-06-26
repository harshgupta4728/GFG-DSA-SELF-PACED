class Solution {
    public List<Integer> pattern(int N) {
        List<Integer> result = new ArrayList<>();
        if (N == 0) {
            result.add(0);
            return result;
        }
        helper(N, result, true, N);
        return result;
    }

    private void helper(int N, List<Integer> result, boolean decreasing, int initial) {
        if ((N == initial && !decreasing) || (N == initial && initial < 0)) {
            result.add(N);
            return;
        }
        result.add(N);
        if (N > 0 && decreasing)
            helper(N - 5, result, decreasing, initial);
        else if (N < initial)
            helper(N + 5, result, false, initial);
        else
            helper(N - 5, result, true, initial);
    }
}
