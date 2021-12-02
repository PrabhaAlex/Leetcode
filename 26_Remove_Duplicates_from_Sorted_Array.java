class Solution {
    public int removeDuplicates(int[] a) {
        int n=a.length;
      int j=0;
        for(int i=0;i<n-1;i++){
              if(a[i]!=a[i+1]){
                a[j]=a[i];
                  j++;
              }
        }
        if(n!=0)
        a[j++]=a[n-1];
        return j;
    }
}
