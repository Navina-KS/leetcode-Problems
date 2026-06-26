class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> o = new HashMap<>();
        for(int i=0;i<senders.length;i++){
            int word = messages[i].split(" ").length;
            o.put(senders[i],o.getOrDefault(senders[i],0)+word);
        }
        int max =0;
        int count =0;
        String result=" ";
        for(String s :o.keySet()){
         count=o.get(s);
         if(count>max||count ==max &&s.compareTo(result)>0){
            max =count;
            result=s;
         }
        }
        return result;
    }
}