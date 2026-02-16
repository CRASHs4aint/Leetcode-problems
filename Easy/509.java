class Solution {
    public int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
tle
// class Solution {
//     public int fib(int n) {
//         if(n==1 || n==2) return 1;
//         return fib(n-1)+fib(n-2);
//     }
// }
