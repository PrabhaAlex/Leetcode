class Solution {
    public int singleNumber(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n-1;i+=2){
        if(a[i]!=a[i+1]){
            return a[i];
           }
        }
        return a[n-1];
    }
}
