class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0,j = 0,sum = 0;
        for(int k = 0;k <n;k++)
        {
            if(arr[k] == s)
            {
                list.add(k +1);
                list.add(k + 1);
                return list;
            }
        }
        for(i = 0;i < arr.length;i++)
        {
            sum += arr[i];
            while(sum > s)
            {
                sum -= arr[j];
                j++;
            }
            if(sum == s)
            {
                list.add(j+1);
                list.add(i +1 );
                break;
            }
        }
        if(list.size() == 0 || j >i)
        {
            list.clear();
            list.add(-1);
        }
        return list;
    }
}
