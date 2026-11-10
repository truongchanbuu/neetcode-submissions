class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int n1 = s1.length();
        int n2 = s2.length();
        char[] s1Freqs = new char[26];
        char[] s2Freqs = new char[26];

        for (int i = 0; i < n1; ++i) {
            s1Freqs[s1.charAt(i) - 'a']++;
            s2Freqs[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Freqs, s2Freqs)) {
            return true;
        }

        int left = 0;
        for (int right = n1; right < n2; ++right) {
            s2Freqs[s2.charAt(right - n1) - 'a']--;
            s2Freqs[s2.charAt(right) - 'a']++;
            if (Arrays.equals(s1Freqs, s2Freqs)) {
                return true;
            }
        }

        return false;
    }
}
