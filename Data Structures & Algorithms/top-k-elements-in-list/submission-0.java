class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map < Integer, Integer> freq = new HashMap<>();
        for (int i: nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        //put numbers in a list
        List<Integer> numbers = new ArrayList<>(freq.keySet());
        
        //now sort from most freq to least
        numbers.sort((a,b) -> freq.get(b) - freq.get(a));

        int [] result = new int[k];
        for (int i =0; i < k; i++){
            result[i] = numbers.get(i);
        }
        return result;
    }
}
