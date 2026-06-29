class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> a = new ArrayList<>();
        Map<Integer,Integer> o = new HashMap<>();
        for(int i=0;i<nums.length;i++){
        o.put(nums[i],o.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
        if(o.get(nums[i])==1 && !o.containsKey(nums[i]+1) && !o.containsKey(nums[i]-1)){
          a.add(nums[i]);
        }
    }
    return a;
}
}