class Solution {
    public int[][] generateMatrix(int n)
    {
        int[][] arr = new int[n][n];
        
        int srow = 0, scol = 0;
        int erow = n-1, ecol = n-1;
        int count = 1;
        
        while(srow<=erow && scol<=ecol)
        {
            for(int i = scol; i<=ecol;i++)
                arr[srow][i] = count++;
            
            srow++;
            
            for(int i = srow;i<=erow;i++)
                arr[i][ecol] = count++;
            
            ecol--;
            
            for(int i = ecol; i>=scol;i--)
                arr[erow][i] = count++;
            
            erow--;
            
            for(int i = erow; i>=srow;i--)
                arr[i][scol] = count++;
            
            scol++;
        }
        
        return arr;
    }
}