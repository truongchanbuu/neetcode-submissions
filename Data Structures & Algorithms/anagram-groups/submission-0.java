class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for (String str : strs) {
            String signed = signed(str);
            map.computeIfAbsent(signed, (k) -> new ArrayList()).add(str);
        }        

        return new ArrayList(map.values());
    }

    private String signed(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
