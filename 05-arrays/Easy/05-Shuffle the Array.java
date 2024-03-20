class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[2*n];

        int index = 0;

        for(int i=0;i<2*n;i++){

            if(i == n){
                index=1;
            }

            ans[index] = nums[i];
            index+=2;
        }

        return ans;
    }
}