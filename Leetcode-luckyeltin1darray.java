import java.util.HashMap;
import java.util.Map;
class Solution {
    public int findLucky(int[] arr) {
         Map<Integer, Integer> freq = new HashMap<>();
         for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int max = -1; 
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (num == count) {
                max = Math.max(max, num);
            }
        }

        return max;
    }
}