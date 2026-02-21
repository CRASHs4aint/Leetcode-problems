class Solution {
    public boolean containsDuplicate(int[] nums) {
       boolean flag=false;
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]) {
            flag=true;
        }
       }
       return flag;
    }
}

//TLE------------------------------------------------
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         boolean flag =false;
//        for(int i=0;i<nums.length;i++){
//         for(int j=i+1;j<nums.length;j++){
//             if(nums[i]==nums[j]){
//                 flag=true;
//                 break;
//             }
//         }
             
//        } 
//        return flag;
//     }
// }


// incorrect logic----------------------------------
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         boolean flag =false;
//        for(int i=0 ,j=nums.length-1;i<j;i++,j--){
//          if(nums[i]==nums[j]){
//             flag=true;
//          }
//         }
             
//        } 
//        return flag;
//     }
// }