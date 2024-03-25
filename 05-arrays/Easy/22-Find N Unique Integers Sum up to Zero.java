class Solution {
    public int[] sumZero(int n) {

        int fill = 1;

        int[] ans = new int[n];

        for(int i=0;i<n/2;i++){
            ans[i]=fill;
            ans[n-1-i]=fill*(-1);
            fill++;
        }

        if(n%2!=0){
            ans[n/2]=0;
        }
        
        return ans;
    }
}