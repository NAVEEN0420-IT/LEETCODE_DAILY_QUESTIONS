import java.util.Arrays;

public class leetcode3882 {
    public int minCost(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int dp[][][] = new int[n][m][2048];

        for(int ar[][] : dp){
            for(int br[] : ar){
                Arrays.fill(br , -1);
            }
        }
        return helper(arr , 0 , 0 , 0 , dp);
    }
    int helper(int arr[][] , int i , int j , int xor , int dp[][][]){
        if(i>=arr.length || j>=arr[0].length) return Integer.MAX_VALUE;

        xor ^= arr[i][j];

        if(i==arr.length-1 && j==arr[0].length-1) return dp[i][j][xor] = xor;

        if(dp[i][j][xor]!=-1) return dp[i][j][xor];

        return dp[i][j][xor] = Math.min(helper(arr , i+1 , j , xor , dp) , helper(arr , i , j+1 , xor , dp));
    }
}
