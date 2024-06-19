class Solution {
    public int josephus(int n, int k) {
        // Base case: if there is only one person, they are safe at position 0
       if(n == 1) return 1;
        return (josephus(n-1,k) + k - 1) % n + 1;
    }
}
