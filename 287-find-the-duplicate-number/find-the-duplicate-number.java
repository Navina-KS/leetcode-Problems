class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int value=0;
        for(int i=0;i<n;i++){
            
                if(nums[i]==nums[i+1]){
                return nums[i];
            }
           
        }
        
        return -1;
    }
}