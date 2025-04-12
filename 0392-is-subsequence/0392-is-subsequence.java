class Solution {
    public boolean isSubsequence(String sub, String s) {
        // If 'sub' is empty, it is always a subsequence of 's', even if 's' is empty
        if (sub.isEmpty()) return true;
        
        int subIndx = 0;
        
        for (int sIndx = 0; sIndx < s.length(); sIndx++) {
            if (subIndx < sub.length() && s.charAt(sIndx) == sub.charAt(subIndx)) {
                subIndx++;
            }
            if (subIndx == sub.length()) return true;
        }
        
        return false;
    }
}
