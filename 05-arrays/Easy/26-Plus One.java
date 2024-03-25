class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=digits.length-1;i>=0;i--){
            int temp = digits[i]+carry;
            int newDigit = temp%10;
            carry = temp/10;
            ans.add(newDigit);
        }

        if(carry==1){
            ans.add(carry);
        }

        int[] sum = new int[ans.size()];

        for(int i=0;i<sum.length;i++){
            sum[i] = ans.get(ans.size()-1-i);
        }

        return sum;

    }
}