class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        int ans = 0;
        int n = nums.length;
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> i:a.entrySet()){
            if(i.getValue() > n/2){
                ans = i.getKey();
            }
        }
        return ans;
    }
}
