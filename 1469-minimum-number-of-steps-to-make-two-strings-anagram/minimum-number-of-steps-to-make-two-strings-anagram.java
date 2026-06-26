class Solution {
    public int minSteps(String s, String t) {
        int a = s.length();
        int[] freq = new int[26];
        int count =0;
        for(int i=0;i<a;i++){
            freq[(s.charAt(i)-'a')]++; 
            }
            for(int i=0;i<a;i++){
                if(freq[t.charAt(i)-'a']==0){
                    count++;
                }
                else{
                    freq[t.charAt(i)-'a']--;
                }
            }
            return count;

        }
    }
