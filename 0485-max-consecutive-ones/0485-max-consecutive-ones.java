class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int max=0;
      int count=0;
      int start=0;
      int end=0;
    while(end<nums.length){
        if(nums[start]==1 && nums[end]==1){
            count++;
            max=Math.max(max,count);
            end++;
        }
        else{
            end++;
            start = end;
            count=0;
        }
    }
      return max;
    }
}