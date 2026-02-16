class Solution {
    public int[] plusOne(int[] digits) {
     ArrayList<Integer> list = new ArrayList<>();
     int carry=1;
     for(int i=digits.length-1;i>=0;i--){
        if(digits[i] + carry<=9){
            list.add(digits[i] + carry);
            carry=0;
        }
        else{
            list.add(0);
            carry=1;
        }
     }
     if(carry==1) list.add(1);
     Collections.reverse(list);

     
    int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;


    }
}