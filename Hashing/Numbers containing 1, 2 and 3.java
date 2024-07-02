public static void findAll() {
        for (int i = 1; i <= 1000000; i++) {
            if (containsOnly123(i)) {
                mp.put(i, 1);
            }
        }
    }
    
    // Helper function to check if a number contains only the digits 1, 2, and 3
    public static boolean containsOnly123(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 1 && digit != 2 && digit != 3) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
