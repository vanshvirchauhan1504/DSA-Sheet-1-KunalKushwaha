class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        boolean ans = check(mat,target);

        if(ans==false){

            for(int k=0;k<3;k++){

                rotate(mat);
                ans=check(mat,target);

                if(ans==true)
                    return ans;
            }
        }

        return ans;

        
    }

    public boolean check(int[][] mat,int[][] target){

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j])
                    return false;
            }
        }

        return true;

    }

    public void rotate(int[][] mat){

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length-1-j];
                mat[i][mat.length-1-j] = temp;
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i<j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }

                
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
               System.out.print(mat[i][j]);
            }
            System.out.println();

        }
    }
}