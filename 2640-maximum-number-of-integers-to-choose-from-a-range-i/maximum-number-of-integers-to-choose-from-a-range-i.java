class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int m= banned.length;
        Set<Integer> o = new HashSet<>();
        for(int i=0;i<m;i++){
            o.add(banned[i]);
        }
        int sum=0;
        int count =0;
        for(int i=1;i<=n;i++){
            if(!o.contains(i)){
                if(i+sum>maxSum){
                break;
                }
              sum+=i;
             
             count++;
            }
        }
        return count; 
    }
}