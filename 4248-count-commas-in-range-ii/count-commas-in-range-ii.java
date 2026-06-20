class Solution {
    public long  countCommas(long n) {
        // long a = n;
        long count=0;
        long threshold = 1000L;
        while(n>=threshold){
            count+=(n-threshold)+1;
            threshold*=1000L;
        }
        // threshold*=1000L;
        return count;
    }
}