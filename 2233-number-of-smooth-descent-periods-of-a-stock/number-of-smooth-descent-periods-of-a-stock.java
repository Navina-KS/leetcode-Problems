class Solution {
    public long getDescentPeriods(int[] prices) {
        long n= prices.length;
        long count =1;
        long total=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]-prices[i]==1){
                count++;
            }
            else{
                count=1;
            }
             total += count;
        }
        return total;
    }
}