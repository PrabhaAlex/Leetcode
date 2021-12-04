class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a = new ArrayList<>();
        Map<Integer,Integer> b = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            b.put(i,b.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> i:b.entrySet()){
            if(i.getValue()>n/3){
                a.add(i.getKey());
            }
        }
        return a;
    }
}
