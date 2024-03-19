class Solution {
    public int largestAltitude(int[] gain) {

        int[] alt = new int[gain.length];

        int curr = 0;

        for(int i = 0; i<gain.length;i++){
            curr = curr+gain[i];
            alt[i] = curr;
        }

        int max = 0;
        
        for(int i=0;i<alt.length;i++){

            if(alt[i]>max){
                max=alt[i];
            }
        }

        return max;
    }
} 