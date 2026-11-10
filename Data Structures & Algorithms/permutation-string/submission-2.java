class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int n1 = s1.length();
        int n2 = s2.length();
        int[] s1Freqs = new int[26];
        int[] s2Freqs = new int[26];

        for (int i = 0; i < n1; ++i) {
            s1Freqs[s1.charAt(i) - 'a']++;
            s2Freqs[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; ++i) {
            if (s1Freqs[i] == s2Freqs[i]) matches++;
        }

        // if (Arrays.equals(s1Freqs, s2Freqs)) {
        //     return true;
        // }

        for (int right = n1; right < n2; ++right) {
            if (matches == 26) return true;
            
            // s2Freqs[s2.charAt(right - n1) - 'a']--;
            // s2Freqs[s2.charAt(right) - 'a']++;
            // if (Arrays.equals(s1Freqs, s2Freqs)) {
            //     return true;
            // }
            int idx = s2.charAt(right - n1) - 'a';
            s2Freqs[idx]--;
            if (s1Freqs[idx] == s2Freqs[idx]) matches++;
            else if (s1Freqs[idx] - 1 == s2Freqs[idx]) matches--;

            idx = s2.charAt(right) - 'a';
            s2Freqs[idx]++;
            if (s1Freqs[idx] == s2Freqs[idx]) matches++;
            else if (s1Freqs[idx] + 1 == s2Freqs[idx]) matches--;
        }

        return matches == 26;
    }
}
