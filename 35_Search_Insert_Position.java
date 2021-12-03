class Solution {
    public int searchInsert(int[] a, int t) {
        int n=a.length;
        int k=n;
        for(int i=0;i<n;i++){
            if(a[i]>=t){
              return i;
            }
        }  
         return k;
    }
}
