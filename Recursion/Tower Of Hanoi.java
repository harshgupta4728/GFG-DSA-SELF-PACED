class Hanoi {
    
    // Method to solve Tower of Hanoi problem and count moves
    public long toh(int N, int from, int to, int aux) {
        long moves = 0;
        if (N > 0) {
            moves += toh(N - 1, from, aux, to); // Move N-1 disks from 'from' to 'aux'
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            moves++;
            moves += toh(N - 1, aux, to, from); // Move N-1 disks from 'aux' to 'to'
        }
        return moves;
    }
}
