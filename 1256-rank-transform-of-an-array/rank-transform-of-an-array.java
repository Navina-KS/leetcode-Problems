class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] vrr = arr.clone();
        Arrays.sort(vrr);
       
        Map<Integer,Integer> o = new HashMap<>();
         int rank=1;
        for(int value: vrr){
        if(!o.containsKey(value)){
        o.put(value,rank);
         rank++;
        }
        }
        int[] ans = new int[arr.length];
        int demo= 0;
       for(int i=0;i<arr.length;i++){
         ans[i]= o.get(arr[i]);
       }
       return ans;
    }
}