class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i =0;i<=n;i++){
            dp[i]=i;
            for(int j =0;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
