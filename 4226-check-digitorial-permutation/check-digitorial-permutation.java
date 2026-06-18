class Solution {
    public boolean isDigitorialPermutation(int n) {
        int val=0;
        int temp =n;
        while(temp>0){
            int digit = temp%10;
            int demo=1;
            for(int i=1;i<=digit;i++){
            demo*=i;  
            }
            val+=demo;
            temp=temp/10;
        }
        int[] arr1= new int[10];
        int[] arr2= new int[10];
        int t=n;
        while(t>0){
            int dig = t%10;
            arr1[dig]++;
            t=t/10;
        }
        while(val>0){
            int d = val%10;
            arr2[d]++;
            val=val/10;
        }
        return Arrays.equals(arr1,arr2);
        
    }
}