class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        int left = 0;
        int curr = 0;
        HashMap<Integer,Integer> o = new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            o.put(fruits[i],o.getOrDefault(fruits[i],0)+1);
        
        while(o.size()>2){
            int a = fruits[left];
            o.put(a,o.get(a)-1);
            if(o.get(a)==0){
               o.remove(a);
            }
            left++;
        }
         curr = Math.max(curr,i-left+1);
        }
        return curr;
    }
}