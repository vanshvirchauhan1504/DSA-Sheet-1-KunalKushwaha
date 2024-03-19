class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int carry=k;

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=num.length-1;i>=0;i--){
            int sum=carry+num[i];
            int digit=sum%10;
            carry=sum/10;
            temp.add(digit);
        }

        while(carry!=0){
            int digit=carry%10;
            carry=carry/10;
            temp.add(digit);
        }

        Collections.reverse(temp);

        return temp;
        
    }
}