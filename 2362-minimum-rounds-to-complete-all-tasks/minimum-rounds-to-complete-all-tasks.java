class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> o = new HashMap<>();
        for(int a : tasks){
            o.put(a,o.getOrDefault(a,0)+1);
        }
        int total = 0;
        for(int b : o.values()){
            if(b==1){
                return -1;
            }
             else{
                int rounds = b/3;
                if(b%3!=0){
                    total++;
                }
                total+=rounds;
             }
        }
        return total;
        }
}