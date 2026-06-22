class RideSharingSystem{
    //   Queue<Integer> riders;
    //   Queue<Integer> drivers;
     Queue<Integer> riders  = new LinkedList<>();
        Queue<Integer> drivers  = new LinkedList<>();
    public RideSharingSystem() {
    }
    
    public void addRider(int riderId) {
    riders.add(riderId);
    }
    
    public void addDriver(int driverId) {
        drivers.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(drivers.isEmpty()||riders.isEmpty()){
            return new int[]{-1,-1};
        }
        
        return new int[]{ drivers.poll(),riders.poll()};
    }
    
    public void cancelRider(int riderId) {
        riders.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */