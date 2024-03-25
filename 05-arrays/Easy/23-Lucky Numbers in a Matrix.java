class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        int m=matrix.length;
        int n=matrix[0].length;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                boolean minInRow = checkRow(matrix[i][j],matrix,i);
                boolean maxInCol = checkCol(matrix[i][j],matrix,j);

                if(minInRow && maxInCol)
                    ans.add(matrix[i][j]);
            }
        }

        return ans;
        
    }

    public boolean checkRow(int key,int mat[][],int row){

        int min=1000000;

        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]<min){
                min=mat[row][i];
            }
        }

        if(key==min)
            return true;
        else
            return false;

    }

    public boolean checkCol(int key,int mat[][],int col){

        int max=0;

        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
            }
        }

        if(key==max)
            return true;
        else
            return false;

    }
}