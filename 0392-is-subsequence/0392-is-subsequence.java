class Solution {
    public boolean isSubsequence(String sub, String s) {
        if (sub.length() == 0) return true;
        if (sub.length() > s.length()) return false;

        int subIndx = 0;

        for( int sIndx = 0; sIndx < s.length(); sIndx++){
            if(s.charAt(sIndx) == sub.charAt(subIndx)){
                subIndx++;
            }
            if (subIndx == sub.length()) return true;
        }

        return subIndx == sub.length();
    }
}