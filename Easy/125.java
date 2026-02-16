class Solution {
    public boolean isPalindrome(String s) {
      String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();;
      boolean flag = true;
      for(int i=0,j=cleaned.length()-1;i<j;i++,j--){
      
        if(cleaned.charAt(i)!=cleaned.charAt(j)){
            return false;
        }
      } 
      return flag; 
    }
}