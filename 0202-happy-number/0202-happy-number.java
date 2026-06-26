class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(true){
            slow = fun(slow);
            fast = fun(fast);
            fast = fun(fast);

           if(slow == fast) break;
        }
        return slow == 1;
    }
    private static int fun(int n){
     int sum = 0;
            while(n>0){
                int d = n%10;
                sum += d*d;
                n = n/10;
            }
            return sum;
    }        
}