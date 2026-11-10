class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqs = new HashMap<>();
        int res = 0, l = 0, max = 0;
        for (int r = 0; r < s.length(); ++r) {
            freqs.put(s.charAt(r), freqs.getOrDefault(s.charAt(r), 0) + 1);
            max = Math.max(max, freqs.get(s.charAt(r)));

            while ((r - l + 1) - max > k) {
                freqs.put(s.charAt(l), freqs.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
