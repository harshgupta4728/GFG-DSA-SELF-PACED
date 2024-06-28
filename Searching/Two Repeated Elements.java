class Solution
{
    // Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        int[] result = new int[2];
        int resultIndex = 0;

        for (int i = 0; i < n + 2; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                result[resultIndex++] = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
            if (resultIndex == 2) {
                break;
            }
        }

        return result;
    }
}
