//  Space O(N*M)
// class Solution {
    
//     int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
//     public void gameOfLife(int[][] board) {
//         int m = board.length;
//         int n = board[0].length;
    
//         int[][] nboard = new int[m][n];
        
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 int count = 0;
//                 for(int[] d:dir)
//                 {
//                     int r = i+d[0];
//                     int c = j+d[1];
                    
//                     if(r>=0 && r<m && c>=0 && c<n && board[r][c]==1)
//                         count++;
//                 }
//                 if(board[i][j]==1)
//                 {
//                     if(count==2 || count==3)
//                         nboard[i][j] = 1;
//                 }
//                 else
//                 {
//                     if(count==3)
//                         nboard[i][j] = 1;
//                 }
//             }
//         }
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 board[i][j] = nboard[i][j];
//             }
//         }      
//     }
// }

class Solution {
    
    int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
          
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int count = 0;
                for(int[] d:dir)
                {
                    int r = i+d[0];
                    int c = j+d[1];
                    
                    if(r>=0 && r<m && c>=0 && c<n && (board[r][c]==1 || board[r][c]==2))
                        count++;
                }
                if(board[i][j]==1)
                {
                   if(count<2 || count>3)
                       board[i][j] = 2;  // 2->alive to dead
                }
                else
                {
                    if(count==3)
                       board[i][j] = 3; // 3->dead to alive
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]%=2;
            }
        }      
    }
}
