class Solution {
    public int countDistinctIntegers(int[] nums) {
       HashSet<Integer> o = new HashSet<>();

       for(int i=0;i<nums.length;i++){
        o.add(nums[i]);
       }
       
       for(int i=0;i<nums.length;i++){
        int rev=0;
    //    int demo=0;
        if(nums[i]<=9)
        o.add(nums[i]);
            int val= nums[i];
            while(val>0){
               int digit=val%10;
            rev=(rev*10)+digit;
            val/=10;
            }
            o.add(rev);
        }
       
       return o.size();
    }
}