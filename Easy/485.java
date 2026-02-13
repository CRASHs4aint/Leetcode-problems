// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
            
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//                 else{
//                     count=0;
//                 }
//             }
           
//         }
//          return count;
        
//     }
// }
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}
