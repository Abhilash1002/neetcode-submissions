class Solution {
    public int[] getIndex(int val,int r,int c){
        return new int[]{(val)/c,(val)%c};
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0, right = r*c-1;
        while(left <= right){
            int mid = (right-left)/2 + left;
            int[] arr = getIndex(mid,r,c);
            int x = arr[0] , y = arr[1];
            System.out.println("mid:" + mid + " x:"+x+" y:"+y );
            if(matrix[x][y] == target){
                return true;
            }else if(matrix[x][y] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}
