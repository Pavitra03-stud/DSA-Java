class Solution {
     public boolean isPalindrome(String s) {
        String str="";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str+=Character.toLowerCase(c);
            }
        }
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                rev+=Character.toLowerCase(c);
            }
        }
        return str.equals(rev);
     }
}