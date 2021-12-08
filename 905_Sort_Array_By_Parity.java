class Solution {
    public int[] sortArrayByParity(int[] a) {
        int n = a.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2 == 0){
                int d = a[i];
                a[i]=a[j];
                a[j]=d;
                j++;
            }
        }
        return a;
    }
}
