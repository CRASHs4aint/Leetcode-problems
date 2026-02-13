class Solution {
    public int[] minOperations(String boxes) {
        int[] brr=new int[boxes.length()];
        int k=0;
        int[] arr=new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
          arr[i] = boxes.charAt(i) - '0';
      }
 for (int i = 0; i < arr.length; i++) {
    
     int sum=0;
     for(int j=0;j<arr.length;j++){
        if(arr[j]==1){
        sum=sum + Math.abs(i-j);
        }
        
     }
     brr[k]=sum;
        k++;
      
 }
 return brr;
    }
}