class Solution {
    // Function to return the name of the candidate that received the maximum votes.
    public static String[] winner(String arr[], int n) {
        // Using a HashMap to count the votes for each candidate.
        HashMap<String, Integer> voteCount = new HashMap<>();
        
        for (String candidate : arr) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }
        
        // Variables to keep track of the winner and the maximum votes.
        String winner = "";
        int maxVotes = 0;
        
        // Iterate over the HashMap to find the candidate with the maximum votes.
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();
            
            // Update the winner if the current candidate has more votes
            // or the same number of votes but is lexicographically smaller.
            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                winner = candidate;
                maxVotes = votes;
            }
        }
        
        // Return the result as an array of strings.
        return new String[]{winner, String.valueOf(maxVotes)};
    }
}
