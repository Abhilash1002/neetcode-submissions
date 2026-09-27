class Solution {
    public void recurKill(char[][] grid,int i,int j,int r,int c){
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        int dir[] = {1,0,-1,0,1};
        for(int k=0;k<4;k++){
            recurKill(grid,i+dir[k],j+dir[k+1],r,c);
        }
    }
    public int numIslands(char[][] grid) {
        int ans = 0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1'){
                    ans++;
                    recurKill(grid,i,j,r,c);
                }

            }
        }
        return ans;
    }
}
