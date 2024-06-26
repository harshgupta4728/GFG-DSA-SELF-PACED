class Solution {
    public int betBalance(String result) {
        int N, i, balance = 4, bet = 1;
        N = result.length();

        // loop for calculating the final balance
        for (i = 0; i < N; i++) {
            if (result.charAt(i) == 'W') {
                balance += bet;
                bet = 1;
            } else {
                balance -= bet;
                bet *= 2;
            }
            if (balance < bet && i < N - 1) {
                balance = -1;
                break;
            }
        }
        return balance;
    }
}
