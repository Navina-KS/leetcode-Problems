class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n= nums.length;
          if(n<3){
            return 0;
          }
        int count =0;
        int count1=0;
        for(int i=2;i<n;i++){
           if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                count++;
                count1+=count;
              }
              else{
                count=0;
              }
            }
            return count1;
        }
    }
