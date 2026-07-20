class Solution {
    public long minimumSteps(String s) {
       int n = s.length();
       long count =0;
       int value =0;
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='1'){
            value++;
        }
        else{
           count+=value;
        }
       }
       return count; 
    }
}