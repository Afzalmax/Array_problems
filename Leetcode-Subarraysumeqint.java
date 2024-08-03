class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> sumCount = new HashMap<>();
        int cs=0;
        int rs=0;
        sumCount.put(0,1);
        for(int num:nums){
            cs+=num;
            if(sumCount.containsKey(cs-k)){
                rs+=sumCount.get(cs-k);
            }
            sumCount.put(cs,sumCount.getOrDefault(cs,0)+1);
        }
        return rs;
    }
}