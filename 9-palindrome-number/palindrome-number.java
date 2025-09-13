class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        int revNo = 0;

        while(n>0){
            int d = n%10;
            revNo = revNo*10 + d;
            n = n/10 ;
        }
        if(revNo == x){
            return true;
        }else {
            return false;
        }
    }
}