class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int[] arr = new int[n];
        int k=0;
        int count =1;
        for(int i=0;i<n-1;i++){
           if(nums[i]==nums[i+1])
           count++;
           else
           count=1;
           if(count<=2){
            arr[k]=nums[i];
            k++;
           }
        }
        arr[k]=nums[n-1];
        k++;
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        
        return k;
    }
}