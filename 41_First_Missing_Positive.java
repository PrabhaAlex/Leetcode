class Solution {
    public int firstMissingPositive(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int ans = 0; int j = n;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                j = i;
                break;
            }
        }
        ans = 1;
        for(int i=j;i<n;){
            if(a[i] == ans){
               // int k = i;
                while(i<n && a[i] == ans){
                    i++;
                }
                ans++;
             
            }
            else
                break;
        }
        return ans;
    }
}
