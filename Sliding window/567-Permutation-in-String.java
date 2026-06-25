import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String target = new String(arr1);
        int k = s1.length();
        for(int i = 0; i <= s2.length() - k; i++) {
            String sub = s2.substring(i, i + k);
            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);
            String current = new String(arr2);
            if(current.equals(target)) {
                return true;
            }
        }
        return false;
    }
}