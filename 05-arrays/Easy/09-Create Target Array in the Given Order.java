class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {


        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0; i<nums.length;i++){
            list.add(index[i],nums[i]); 
        }   

        for(int i=0;i<nums.length;i++){
            nums[i] = (int)list.get(i);
        }

        return nums;
        
    }
}