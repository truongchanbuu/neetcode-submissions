class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqs = new HashMap<>();
        for (int n : nums) {
            freqs.put(n, freqs.getOrDefault(n, 0) + 1);
        }

        freqs = freqs
            .entrySet()
            .stream()
            .sorted(
                Map.Entry.<Integer, Integer>comparingByValue().reversed()
            )
            
            .collect(
                Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue,
                    LinkedHashMap::new
                )
            );

        int[] res = new int[k];
        List<Integer> keys = new ArrayList<>(freqs.keySet());
        for (int i = 0; i < k; ++i) {
            res[i] = keys.get(i);
        }
        return res;
    }
}
