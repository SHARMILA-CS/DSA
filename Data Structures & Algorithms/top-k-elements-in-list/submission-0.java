class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        // Keep only k most frequent elements
        for(Integer num : map.keySet()) {
            pq.offer(num);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        // Build answer
        int[] result = new int[k];

        for(int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}