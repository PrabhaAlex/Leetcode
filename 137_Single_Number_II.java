class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        int ans=0;
        
        for( int i:nums){
             a.put(i,a.getOrDefault(i,0)+1);     
        }
        for(Map.Entry<Integer,Integer>i:a.entrySet())          {          
            if(i.getValue()== 1){
            ans=i.getKey(); 
            
          }
        }
        return ans;
    }
}
