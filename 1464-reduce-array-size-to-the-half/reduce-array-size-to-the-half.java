class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> o = new HashMap<>();
        for(int i=0;i<n;i++){
            o.put(arr[i],o.getOrDefault(arr[i],0)+1);
        }
        List<Integer> p = new ArrayList<>(o.values());
        p.sort(Collections.reverseOrder());
        int sum=0;
        int count =0;
        int target = n/2;
        for(int i=0;i<p.size();i++){
            sum+=p.get(i);
             count++;
            if(sum>=target)
            break;
        }
        return count;
    }
}