class Solution {
    public int minPairSum(int[] nums) {
    //    for(int i=0;i<nums.length;i++) {
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]>nums[j]){
    //             int temp =nums[i];
    //             nums[i]=nums[j];
    //             nums[j]=temp;
    //         }
    //     }
    //    }
Arrays.sort(nums); 
int[] sum=new int[(nums.length)/2];
int k=0;
       for(int i=0,j=nums.length-1;i<j;i++,j--){
        sum[k]=nums[i]+nums[j];
        k++;
       }
       int max=0;
       for(int i=0;i<sum.length;i++){
        if(sum[i]>max){
         max=sum[i];
        }
        
       }
       return max;
    }

}