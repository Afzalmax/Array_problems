class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double mavg = Integer.MIN_VALUE;
        int n = nums.length;
        
        for (int i = 0; i <= n - k; i++) {
            int curr_sum = 0;
            for (int j = 0; j < k; j++) {
                curr_sum += nums[i + j];
            }
            double curr_avg = (double) curr_sum / k;
            mavg = Math.max(curr_avg, mavg);
        }
        
        return mavg;
    }
}
