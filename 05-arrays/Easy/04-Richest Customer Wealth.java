class Solution {
    public int maximumWealth(int[][] accounts) {

        int row = accounts.length;
        int col = accounts[0].length;

        int amount;
        int max = 0;

        for(int i = 0 ;i < row; i++){

            amount = 0;

            for(int j=0;j<col;j++){
                amount+=accounts[i][j];
            }

            if(amount>max)
                max = amount;
            
        }

        return max;
        
    }
}