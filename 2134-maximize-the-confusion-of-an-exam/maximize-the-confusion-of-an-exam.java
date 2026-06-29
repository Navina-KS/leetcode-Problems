class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
       int left =0;
       int right = 0;
       int t=0;
    int f =0;
    int max=0;
    for(int i=0;i<n;i++)
    
      {
        if(answerKey.charAt(i)=='T')
            t++;
        else 
          f++;
          while(t>k && f>k){
             if(answerKey.charAt(left)=='T')
             t--;
             else
             f--;
             left++;
          }
       max =Math.max(max,i-left+1);
    }
    return max;
}
}