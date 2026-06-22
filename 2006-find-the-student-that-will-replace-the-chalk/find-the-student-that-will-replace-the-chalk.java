class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long diff = 0;
        long val=0;
        for(int i=0;i<n;i++){
             val+=chalk[i];
        }
        diff = k%val;
        for(int i=0;i<n;i++){
            if(diff<chalk[i]){
               return i;
            }
            else{
                diff-=chalk[i];
            }
        }
    
        return 0;    
    }
}