class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {        
        int n = grid.length, m = grid[0].length;
        k%=(n*m);
        
        int[][] ans = new int[n][m];
        
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                int nrow = i, ncol = j+k;
                if(ncol>=m)
                {
                    nrow+=ncol/m;
                    if(nrow>=n)
                        nrow = nrow%n;
                
                    ncol = ncol%m;
                }
             ans[nrow][ncol] = grid[i][j];       
            }
        }
        return (List) Arrays.asList(ans);
    }
    
}