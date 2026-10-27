public class leetcode3963 {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];
        int z=0;
        for(int i=0;i<m;i++){
            String str = "";
            for(int j=0;j<n;j++){
                if(j==n-1 || i==0) str+='.';
                else str+='#';
            }
            arr[z++] = str;
        }
        return arr;
    }
}
