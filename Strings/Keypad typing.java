public static String printNumber(String s, int n) {
    // Your code here
    // Create a map from characters to their corresponding digits on the keypad
    Map<Character, Character> keypadMap = new HashMap<>();
    keypadMap.put('a', '2'); keypadMap.put('b', '2'); keypadMap.put('c', '2');
    keypadMap.put('d', '3'); keypadMap.put('e', '3'); keypadMap.put('f', '3');
    keypadMap.put('g', '4'); keypadMap.put('h', '4'); keypadMap.put('i', '4');
    keypadMap.put('j', '5'); keypadMap.put('k', '5'); keypadMap.put('l', '5');
    keypadMap.put('m', '6'); keypadMap.put('n', '6'); keypadMap.put('o', '6');
    keypadMap.put('p', '7'); keypadMap.put('q', '7'); keypadMap.put('r', '7'); keypadMap.put('s', '7');
    keypadMap.put('t', '8'); keypadMap.put('u', '8'); keypadMap.put('v', '8');
    keypadMap.put('w', '9'); keypadMap.put('x', '9'); keypadMap.put('y', '9'); keypadMap.put('z', '9');

    // Use StringBuilder for efficient string concatenation
    StringBuilder result = new StringBuilder();
    
    // Convert each character to its corresponding digit
    for (char c : s.toCharArray()) {
        result.append(keypadMap.get(c));
    }
    
    return result.toString();
}
