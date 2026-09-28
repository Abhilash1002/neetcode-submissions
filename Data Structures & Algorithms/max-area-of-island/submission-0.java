class Solution {
    public int calculateArea(int[][] grid,int i,int j,int r,int c){
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        int ans = 0;
        int[] dir = {1,0,-1,0,1};
        for(int k=0;k<4;k++){
            ans += calculateArea(grid,i+dir[k],j+dir[k+1],r,c);
        }
        return ans + 1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int res = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == 1){
                    res = Math.max(res,calculateArea(grid,i,j,r,c));
                }
            }
        }
        return res;
    }
}
