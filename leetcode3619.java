public class leetcode3619 {
     public int countIslands(int[][] arr, int k) {
        int n = arr.length;
        int m = arr[0].length;
        int row[] = {1,-1,0,0};
        int col[] = {0,0,1,-1};
        int count = 0;
      
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
                if(arr[i][j]!=0){
                  long  sum =  helper(arr , i , j , row , col);
                   if(sum%k==0) count++;
                }
            }
        }
        return count;
    }
    long helper(int arr[][] , int i , int j , int row[] , int col[]){
        int n = arr.length;
        int m = arr[0].length;
        if(i>=n || i<0 || j>=m || j<0 || arr[i][j]==0) return 0;
       
         long sum = arr[i][j];
         arr[i][j] = 0;
          sum+= helper(arr , i+row[0] , j+col[0] ,row , col  ) ;
           sum+=helper(arr , i+row[1] , j+col[1] ,row , col  ) ;
           sum+=helper(arr , i+row[2] , j+col[2] ,row , col  ) ;
           sum+=helper(arr , i+row[3] , j+col[3] ,row , col  );
           return sum;
    }
}
