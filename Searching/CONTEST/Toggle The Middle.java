class Geeks {
    public int toggleTheMiddle(int n) {
        String binaryString = Integer.toBinaryString(n);
        int length = binaryString.length();
        
        char[] binaryArray = binaryString.toCharArray();
        
        if (length % 2 == 0) {
            // If the length is even, toggle both middle bits
            binaryArray[length / 2 - 1] = toggle(binaryArray[length / 2 - 1]);
            binaryArray[length / 2] = toggle(binaryArray[length / 2]);
        } else {
            // If the length is odd, toggle the single middle bit
            binaryArray[length / 2] = toggle(binaryArray[length / 2]);
        }
        
        String toggledBinaryString = new String(binaryArray);
        return Integer.parseInt(toggledBinaryString, 2);
    }
    
    private char toggle(char bit) {
        return bit == '0' ? '1' : '0';
    }
}
