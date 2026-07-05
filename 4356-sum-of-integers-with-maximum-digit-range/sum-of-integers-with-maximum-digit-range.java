class Solution {
    public int maxDigitRange(int[] nums) {
        int n= nums.length;
        // int min=9;
        // int max =0;
        int maxRange=0;
        int[] r = new int[n];
        for(int i=0;i<n;i++){
            int min=9;
            int max=0;
            int digit = nums[i];
            while(digit>0){
                int value =digit%10;
                 min = Math.min(min,value);
                 max = Math.max(max,value);
                 digit=digit/10;
            }
            r[i]= max-min;
            maxRange = Math.max(maxRange,r[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(r[i]==maxRange)
            sum+=nums[i];
        }
         return sum;
    }
}