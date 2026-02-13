class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    int[] arr=new int[A.length];
    int k=0;
    for(int i=0,j=0;i<A.length && j<B.length;i++,j++){
        int count=0;
        for(int l=0;l<=i;l++){
            for(int m=0;m<=j;m++){
                if(A[l]==B[m]){
                    count++;
                }
            }
            arr[k]=count;
            
        }
        k++;
        }
    return arr;
    }
}