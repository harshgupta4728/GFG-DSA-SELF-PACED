class Solution {
    public void printNos(int N) {
        if (N > 0) {
            printNos(N - 1); // recursively print numbers from 1 to N-1
            System.out.print(N + " "); // print the current number
        }
    }
}
