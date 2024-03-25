class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])==false){
                temp.add(nums[i]);
            }
        }

        for(int i=0;i<temp.size();i++){
            nums[i] = temp.get(i);
        }

        return temp.size();
        
    }
}