class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
        

    public static boolean isLucky(int n)
    {
        // Your code here
        int position = n;
        int counter = 2;
        
        while (position >= counter) {
            if (position % counter == 0) {
                return false;
            }
            position -= position / counter;
            counter++;
        }
        return true;
         
    }
}
