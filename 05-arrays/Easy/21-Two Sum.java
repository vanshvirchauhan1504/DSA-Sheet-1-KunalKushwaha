class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){

            int v1 = nums[i];

            for(int j=0;j<nums.length;j++){

                int v2 = nums[j];

                if(i!=j && v1+v2==target)
                    return new int[]{i,j};
            }
        }

        return new int[]{};
    }
}