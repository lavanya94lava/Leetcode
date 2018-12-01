class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(m==0&&n==0){
            return 0;
        }
        int[][] ans = new int [n][m];
        ans[0][0] = grid[0][0];
        
        for(int i =1;i<m;i++){
            ans[0][i]= ans[0][i-1]+grid[0][i];
        }
        for(int j = 1;j<n;j++){
            ans[j][0]= ans[j-1][0]+grid[j][0];
        }
        for(int i =1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(ans[i-1][j]>ans[i][j-1]){
                    ans[i][j]=ans[i][j-1]+grid[i][j];
                }
                else{
                    ans[i][j]=ans[i-1][j]+grid[i][j];
                }
            }
        }
        
        
        return ans[n-1][m-1];
        
    }
}
