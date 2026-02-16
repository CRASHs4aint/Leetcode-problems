// class Solution {
//     public String convertDateToBinary(String date) {
//        int number = Integer.parseInt(date.replace("-", ""));
//        int day = number%100;
//        number=number/100;
//        binary(day);
//        int month =number%100;
//         binary(month);
//        number=number/100;
//        int year=number%10000;
//         binary(year);
//        String formatted = binary.substring(0,4) + "-" +
//                   binary.substring(4,6) + "-" +
//                    binary.substring(6,8);
//      return formatted;

//     }
//     public String binary(int a){
//         String bit="";
//         while(a>0){
//            bit=(a%2)+bit;
//            a=a/2; 
//         }
//     }
// }
class Solution {
    public String convertDateToBinary(String date) {
        
        String[] parts = date.split("-");
        
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        String yearBinary = binary(year);
        String monthBinary = binary(month);
        String dayBinary = binary(day);
        
        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }

    public String binary(int a){
        if(a == 0) return "0";
        
        String bit = "";
        while(a > 0){
            bit = (a % 2) + bit;
            a = a / 2; 
        }
        return bit;
    }
}
