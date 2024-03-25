class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if(m==r && n==c)
            return mat;

        if(m*n!=r*c)
            return mat;

        int[] temp = new int[m*n];
        int index = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[index] = mat[i][j];
                index++;
            }
        }

        int[][] ans = new int[r][c];

        index = 0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(j);
                ans[i][j] = temp[index];
                index++;
            }
        }

        return ans;
        
    }
}