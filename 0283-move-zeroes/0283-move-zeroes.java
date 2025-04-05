class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndx = 0;

        for (int i = 0; i < nums.length; i++){
            
            if(nums[i] != 0) {
                nums[nonZeroIndx] = nums[i];

                if(i != nonZeroIndx){
                    nums[i] = 0;
                }

                nonZeroIndx++;
            }

        }
    }
}