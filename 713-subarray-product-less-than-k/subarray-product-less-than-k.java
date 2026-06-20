class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count =0;
        int product =1;
        int start = 0;
        if(k<=1){
            return 0;
        }
        for(int i=0;i<n;i++){
            product*=nums[i];
            while(product>=k){
                product/=nums[start];
                 start++;
            }
        
                 count+=(i-start)+1;
        }
        
        return count;
    }
}