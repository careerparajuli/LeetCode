
class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        else{
            String str = Integer.toString(x);
            String reverse = new StringBuilder(str).reverse().toString();
            return str.equals(reverse);
        }

    }
}