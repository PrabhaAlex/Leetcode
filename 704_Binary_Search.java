class Solution {
    public int search(int[] nums, int target) {
        int n=Arrays.binarySearch(nums,target);
        if(n<0){
     return -1;
        }
        return n;
    }
}
