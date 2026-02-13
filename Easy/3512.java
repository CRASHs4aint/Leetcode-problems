class Solution {
    public int minOperations(int[] nums, int k) {
       int remainder;
       int sum=0;
       for (int i=0;i< nums.length;i++){
          sum=sum + nums[i];
       } 
       remainder=sum%k;
      return remainder;
    }
}