class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer> o = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            o.add(nums[i]);
        }
        int sum =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
              sum+=nums[i];
            }
            else {
            break;
            }
        }
            while(o.contains(sum)){
                sum++;
                continue;
            }
            return sum;
           }
}