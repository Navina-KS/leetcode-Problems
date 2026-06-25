class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> o = new HashMap<>();
        for(int a : nums){
            o.put(a, o.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> k : o.entrySet()){
            if(k.getValue()==1){
                return k.getKey();
            }
        }
        return 0;
    }
}