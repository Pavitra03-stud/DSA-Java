class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                if (str.indexOf(s.charAt(j)) != -1) {
                    break;
                }
                str += s.charAt(j);
                max = Math.max(max, str.length());
            }
        }
        return max;
    }
}