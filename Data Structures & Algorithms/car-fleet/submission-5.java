class Solution {
    public double stepsTaken(int[] a,int k){
      double steps = (double)(k-a[0]) / (double)a[1]; 
      return steps; 
    }
    public int carFleet(int k, int[] position, int[] speed) {
        List<int[]> arr = new ArrayList<>();
        int n = position.length;
        for(int i=0;i<n;i++)
            arr.add(new int[]{position[i],speed[i]});
        Collections.sort(arr,(a,b)->b[0]-a[0]);
        int ans = n;
        for(int i=1,j=0;i<n;i++){
            int[] a = arr.get(j), b = arr.get(i);
            if(stepsTaken(a,k) >= stepsTaken(b,k)){
                ans--;continue;
            }
            j = i;
        }
        return ans;        
    }
}
