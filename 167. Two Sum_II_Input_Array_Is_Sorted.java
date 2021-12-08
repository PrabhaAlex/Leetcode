class Solution {
    public int[] twoSum(int[] a, int t) {
        int n = a.length;
        int ans[] = new int[2];
        for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++)
             if(a[i]+a[j] == t){
                 ans[0] = i+1;
                 ans[1] = j+1;
                 return ans;
             }
        }
        return ans;
    }
}
