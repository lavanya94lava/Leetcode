class Solution {
    private int j,k,l;
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0]=1;
        for(int i =1;i<n;i++){
            int a = dp[j]*2;
            int b = dp[k]*3;
            int c = dp[l]*5;
            
            dp[i]= Math.min(a,Math.min(b,c));
            if(dp[i]==a){
                j++;
            }
            if(dp[i]==b){
                k++;
            }
            if(dp[i]==c){
                l++;
            }
            
        }
        return dp[n-1];
    }
}
