class Geeks
{
   public static long FindMaxSum(long arr[], int n)
    {
        if (n == 0) return 0;
        if (n == 1) return arr[0];
        
        long incl = arr[0];
        long excl = 0;
        
        for (int i = 1; i < n; i++)
        {
            long new_excl = Math.max(incl, excl);
            incl = excl + arr[i];
            excl = new_excl;
        }
        
        return Math.max(incl, excl);
    }
}
