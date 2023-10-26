class Solution {
    public boolean isPalindrome(int x) {
        long reversed = 0;
        long temp = x;

        if (x < 0) {
            return false;
        } 

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10; 
        }
        return (reversed == x);
    }
}
