class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String signed = sorted(str);
            map.computeIfAbsent(signed, k -> new ArrayList<String>()).add(str);
        }
        
        return map.values().stream().toList();
    }

    private String sorted(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
