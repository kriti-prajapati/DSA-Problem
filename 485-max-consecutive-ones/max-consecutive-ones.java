class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int MaxCount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                MaxCount=Math.max(count,MaxCount);
            }
            else count=0;
        }
        return MaxCount;
    }
}