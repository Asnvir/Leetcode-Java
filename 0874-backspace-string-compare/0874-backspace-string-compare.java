class Solution {
  public boolean backspaceCompare(String s, String t) {
    int sIndx = s.length() - 1;
    int tIndx = t.length() - 1;
    int sSkipCntr = 0;
    int tSkipCntr = 0;

    while (sIndx >= 0 || tIndx >= 0) {
      
      while (sIndx >= 0 && (s.charAt(sIndx) == '#' || sSkipCntr > 0)) {
        if (s.charAt(sIndx) == '#') {
          sSkipCntr++;
        } else {
          sSkipCntr--;
        }
        sIndx--;
      }

      while (tIndx >= 0 && (t.charAt(tIndx) == '#' || tSkipCntr > 0)) {
        if (t.charAt(tIndx) == '#') {
          tSkipCntr++;
        } else {
          tSkipCntr--;
        }
        tIndx--;
      }

      if (sIndx >= 0 && tIndx >= 0 && s.charAt(sIndx) != t.charAt(tIndx)) {
        return false;
      }

      if ((sIndx >= 0) != (tIndx >= 0)) {
        return false;
      }

      sIndx--;
      tIndx--;
    }

    return true;
  }
}
