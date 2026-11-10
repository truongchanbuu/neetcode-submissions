class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < n1; ++i) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; ++i) {
            if (s1Count[i] == s2Count[i]) matches++;
        }

        for (int right = n1; right < n2; ++right) {
            if (matches == 26) return true;
            
            int idx = s2.charAt(right - n1) - 'a';
            s2Count[idx]--;
            if (s1Count[idx] == s2Count[idx]) matches++;
            else if (s1Count[idx] - 1 == s2Count[idx]) matches--;

            idx = s2.charAt(right) - 'a';
            s2Count[idx]++;
            if (s1Count[idx] == s2Count[idx]) matches++;
            else if (s1Count[idx] + 1 == s2Count[idx]) matches--;
        }

        return matches == 26;
    }
}
