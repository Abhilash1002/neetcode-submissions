class Solution {
    class Point{
        int x, y;
        public Point(int[] p){
            this.x = p[0];
            this.y = p[1];
        }
        public int getDistance(){
            return (x*x + y*y);
        }
        public int[] getArr(){
            return new int[]{x,y};
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> minHeap = new PriorityQueue<>((a,b) -> (a.getDistance() - b.getDistance()) );
        for(int[] p:points){
            minHeap.add(new Point(p));
        }
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            ans[i] = minHeap.poll().getArr();
        }
        return ans;

    }
}
