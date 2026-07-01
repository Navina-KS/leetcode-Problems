class Solution {
    public boolean isPalindrome(String Value){
        int left = 0;
        int right=Value.length()-1;
        while(left<right){
            if(Value.charAt(left)!=Value.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public int countSubstrings(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
           for(int j=i+1;j<=s.length();j++){
            String value=s.substring(i,j);
            if(isPalindrome(value))
                count++;
           }
           }
        return count;
    }
}