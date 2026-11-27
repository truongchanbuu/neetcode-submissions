class KthLargest {
    final PriorityQueue<Integer> queue;
    int[] nums;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        this.queue = new PriorityQueue<>();

        if (nums.length != 0) {
            for (int n : nums) {
                this.add(n);
            }
        }
    }
    
    public int add(int val) {
        this.queue.add(val);
        if (this.queue.size() > this.k) this.queue.poll();
        return this.queue.peek();
    }
}
