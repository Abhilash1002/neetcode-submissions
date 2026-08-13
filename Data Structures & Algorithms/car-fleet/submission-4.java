class Solution {
    public double stepsTaken(int[] a,int k){
      double steps = (double)(k-a[0]) / (double)a[1]; 
    //   if((((k-a[0])%a[1])>0))steps++;
      return steps; 
    }
    public boolean canOvertake(int[] a,int[] b,int k){
        double steps_a = stepsTaken(a,k);
        double steps_b = stepsTaken(b,k);
        return steps_b <= steps_a;
    }
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> arr = new ArrayList<>();
        int n = position.length;
        for(int i=0;i<n;i++){
            arr.add(new int[]{position[i],speed[i]});
        }
        Collections.sort(arr,(a,b)->b[0]-a[0]);
        // for(int[] c:arr)
        //     System.out.print(c[0] + " ");
        // System.out.println("");
        // for(int[] c:arr)
        //     System.out.print(c[1] + " ");
        // System.out.println("");
        // for(int[] c:arr)
        //     System.out.print(stepsTaken(c,target) + " ");
        // System.out.println("");
        int ans = n;
        for(int i=1,j=0;i<n;i++){
            int[] a = arr.get(j);
            int[] b = arr.get(i);
            if(canOvertake(a,b,target)){
                // System.out.println(b[0] + " overtakes " + a[0]);
                ans--;
            }else{
                j = i;
            }
        }
        return ans;        
    }
}
