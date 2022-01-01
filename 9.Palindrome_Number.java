class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuilder str = new StringBuilder(value);
        str.reverse();
        
        if(str.toString().equals(value)){
            return true;
        }
        return false;
    }
}
