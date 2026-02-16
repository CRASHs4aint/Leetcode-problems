// class Solution {
//     public void rotate(int[] nums, int k) {
//          k= k%nums.length;
//         reverse(nums,0,nums.length-1);
//         reverse(nums,0,k-1);
//         reverse(nums,k,nums.length-1);
//         return nums;
//     }
//     public void reverse(int[] nums ,int i,int j){
//         for(i=0,j=nums.length-1;i<=j;i++,j--){
//             int temp=nums[i];
//             nums[i]=nums[j];
//             nums[j]=temp;
//         }
//     }
    
// }
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
