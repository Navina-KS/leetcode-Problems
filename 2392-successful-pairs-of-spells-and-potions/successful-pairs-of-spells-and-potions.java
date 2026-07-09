class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n= spells.length;
        int m=potions.length;
       int[] arr = new int[n];
        for(int i=0;i<spells.length;i++){
          int low =0;
          int high =m-1;
          while(low<=high){
            int mid = low+(high-low)/2;
        if((long)spells[i]*potions[mid]>=success){
            high=mid-1;
        }
        else{
            low=mid+1;
        }  
          }
          arr[i]=m-low;
        }
        return arr;
    }
}