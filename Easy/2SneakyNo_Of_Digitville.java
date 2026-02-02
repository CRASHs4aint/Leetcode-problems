class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int k=0;


    //     int sum=nums.length*(nums.length +1)/2;
    //     int sum_arr=0
    //    for(int i=0;i<nums.length;i++){
    //     sum=sum + nums[i];
    //    }

    //    int diff= sum_arr -sum;

       for(int i=0;i<nums.length;i++){
        for (int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
               arr[k]=nums[i];
               k++; 
            }
        }
       }
       return arr;
        
    }
}