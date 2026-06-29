class Solution {
    public int prefixConnected(String[] words, int k) {
        int n=words.length;
          
        Map<String,Integer> o = new HashMap<>();
         for(int i=0;i<words.length;i++){
             String value =words[i];
             if(value.length()<k)
             continue;
           String demo =value.substring(0,k);
            o.put(demo, o.getOrDefault(demo,0)+1);
         }
        List<Integer> a = new ArrayList<>(o.values());
        int count =0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>1){
           count++;
            }
        }
        return count;
    }
}