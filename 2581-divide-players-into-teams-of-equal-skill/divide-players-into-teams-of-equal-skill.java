class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left =1;
        long val=0;
        // 1 2 3 3 4 5
        long ans=0;
        int right=skill.length-2;
        long target = skill[left-1]+skill[right+1];
        ans+=skill[left-1]*skill[right+1];
        while(left<right){
         val =skill[left]+skill[right];
         if(val==target)
         {
           ans+=skill[left]*skill[right];
           left++;
           right--;
         }
         else{
            return -1;
         }
        }
        return ans;
    }
}