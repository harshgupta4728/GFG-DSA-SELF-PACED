class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int d = b * b - 4 * a * c;  // Calculating the discriminant

        if (d < 0) {
            // If the discriminant is negative, roots are imaginary
            result.add(-1);
        } else {
            // Calculating the square root of the discriminant
            double sqrt_val = Math.sqrt(d);
            // Finding the two roots
            double root1 = (-b + sqrt_val) / (2 * a);
            double root2 = (-b - sqrt_val) / (2 * a);
            // Adding the floor values of the roots to the result list in descending order
            if (root1 > root2) {
                result.add((int) Math.floor(root1));
                result.add((int) Math.floor(root2));
            } else {
                result.add((int) Math.floor(root2));
                result.add((int) Math.floor(root1));
            }
        }
        return result;
    }
}