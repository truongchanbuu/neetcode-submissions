class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int n : nums) {
            freqs.put(n, freqs.getOrDefault(n, 0) + 1);
        }

        freqs = freqs
            .entrySet()
            .stream() 
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(
                Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldKey, newKey) -> oldKey,
                    LinkedHashMap::new
                )
            );

        List<Integer> keys = new ArrayList<>(freqs.keySet());
        int[] res = new int[k];

        for (int i = 0; i < k; ++i) {
            res[i] = keys.get(i);
        }

        return res;
    }
}
