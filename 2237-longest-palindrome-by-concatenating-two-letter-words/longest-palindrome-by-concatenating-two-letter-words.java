class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> o = new HashMap<>();
        int length=0;
        for(int i=0;i<words.length;i++){
            String ch = words[i];
            String rev = ""+ch.charAt(1)+ch.charAt(0);
            if(o.getOrDefault(rev,0)>0){
                length+=4;
                o.put(rev,o.getOrDefault(rev,0)-1);
            }
            else{
                o.put(ch,o.getOrDefault(ch,0)+1);
            } 
            }
            for(int i=0;i<26;i++){
                char c = (char)('a'+i);
                String d = ""+c+c;
                if(o.getOrDefault(d,0)>0){
                    length+=2;
                    break;
                }
            }
        
        return length;
    }
}