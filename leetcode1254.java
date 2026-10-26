public class leetcode1254 {
     public int closedIsland(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int row[]  ={1,-1,0,0};
        int col[] = {0,0,1,-1};
        boolean visited[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            if(arr[i][0]==0)
            helper(arr , i , 0 , row , col , visited);
        }
        for(int j=0;j<m;j++){
            if(arr[0][j]==0)
            helper(arr , 0 , j , row , col , visited);
        }
        for(int i=0;i<n;i++){
            if(arr[i][m-1]==0)
            helper(arr , i , m-1 , row , col , visited);
        }
        for(int j=0;j<m;j++){
            if(arr[n-1][j]==0)
            helper(arr , n-1 , j , row , col , visited);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(arr[i][j]==0){
                count++;
               helper(arr , i , j , row , col , visited);
            }
            }
        }
           return count;
    }
    void helper(int arr[][] , int i , int j , int row[] , int col[] ,boolean visited[][]){
        int n = arr.length;
        int m = arr[0].length;
        if(i==n || i<0 || j==m || j<0 || visited[i][j] || arr[i][j]!=0) return;
          
          arr[i][j] = 5;
          visited[i][j] = true;

          helper(arr , i+row[0] , j+col[0] , row , col , visited);
          helper(arr , i+row[1] , j+col[1] , row , col , visited);
          helper(arr , i+row[2] , j+col[2] , row , col , visited);
          helper(arr , i+row[3] , j+col[3] , row , col , visited);

    }
}