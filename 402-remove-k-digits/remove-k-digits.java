class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder o = new StringBuilder();
        Stack<Character> m = new Stack<>();
        for(char ch :num.toCharArray()){
            while(k>0 && !m.isEmpty() && m.peek()>ch){
                m.pop();
                k--;
            }
            m.push(ch);
        }
        while(k>0){
            m.pop();
            k--;
        }
        for(char ch :m){
            o.append(ch);
        }
        while(o.length()>0 && o.charAt(0) == '0') {
             o.deleteCharAt(0); }
              if (o.length() == 0) {
                 return "0";
                  } 
                  return o.toString();
    }
}