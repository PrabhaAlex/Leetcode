class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+a[i];
        sum = Math.max(a[i],sum);
        max = Math.max(sum,max);
          }
        return max;
    }
}
