// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int m=nums1.length;
//          int n=nums2.length;
//         double[] a=new double[m+n];
//         int i=0,j=0,k=0;
//         while(i<m && j<n){
//             if(nums1[i]<=nums2[j]) a[k++]=nums1[i++];
//             else a[k++]=nums2[j++];
//         }
//         while(i<m) a[k++]=nums1[i++];
//         while(j<n) a[k++]=nums2[j++];
        
//        double odd=a[(((a.length)-(a.length-1)/2))-1];
//        double even=a[(a.length/2) -1] + a[(a.length/2+1) -1];

//         if(a.length==0 && a.length==1) return a[a.length];
//         if(a.length%2!=0) return odd;
//         else return even/2 ;

       
//     }
// }
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        
        double[] a = new double[m + n];
        
        int i = 0, j = 0, k = 0;
        
        // Merge two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j])
                a[k++] = nums1[i++];
            else
                a[k++] = nums2[j++];
        }
        
        while (i < m) a[k++] = nums1[i++];
        while (j < n) a[k++] = nums2[j++];
        
        int len = a.length;
        
        
        if (len % 2 != 0) {
            return a[len / 2];
        } 
        
        else {
            return (a[len / 2 - 1] + a[len / 2]) / 2.0;
        }
    }
}
