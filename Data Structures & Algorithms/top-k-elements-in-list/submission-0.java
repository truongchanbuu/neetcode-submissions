class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap();
        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }

        freqs = freqs.entrySet()
        .stream()
        .sorted(
            Map.Entry.<Integer, Integer>comparingByValue()
            .reversed())
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (oldVal, newVal) -> oldVal,
            LinkedHashMap::new 
        ));
        int[] res = new int[k];
        ArrayList<Integer> keys = new ArrayList(freqs.keySet());
        for (int i = 0; i < k; ++i) {
            res[i] = keys.get(i);
        }

        return res;
    }
}
