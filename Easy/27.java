// class Solution {
//     public int removeElement(int[] nums, int val) {
      
//       int count=0;
//       for(int i=0;i<nums.length;i++){
//       if(nums[i]==val){
//             nums[i]=0;
//             count++;
//         }
//       }
//       Arrays.sort(nums);
//       for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
//     int temp = nums[i];
//     nums[i] = nums[j];
//     nums[j] = temp;
// }
// for(int i=0;i<nums.length;i++){
//       if(nums[i]==0){
//             nums[i]=;
           
//         }
//       }
//       return nums.length-count;
//       return nums;  
//     }
// }
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;  
    }
}
