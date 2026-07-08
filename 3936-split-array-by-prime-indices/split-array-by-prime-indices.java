class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
       long sumA = 0;
       long sumB =0;
       for(int i=0;i<n;i++){
        if(isPrime(i)){
            sumA+=nums[i];
        }
        else{
            sumB+=nums[i];
        }
       }
       return Math.abs(sumB-sumA);
        }
        private boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            }
           return true;
        }
    }
