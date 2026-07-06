class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])
            return b[1]-a[1];
            return a[0]-b[0];
        });
        int count=0;
      int val=0;
      int left =-1;
      int right =-1;
        for(int[] interval : intervals){
            if(interval[0]>left && interval[1]>right){
            count++;
            left= interval[0];
            }
            right = Math.max(right,interval[1]);
        }
        return count;
    }
}