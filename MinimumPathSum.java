package leecode;

public class MinimumPathSum {

	
public int minPathSum(int[][] grid) {
	     if(grid.length == 0) return 0;
         int m = grid.length;
         int n = grid[0].length;
         int initRow = grid[0][0];
         int initCol = grid[0][0];
         for(int i=1;i<m;i++){
        	 initRow += grid[i][0];
        	 grid[i][0] = initRow;
         }
         for(int i=1;i<n;i++){
        	 initCol += grid[0][i];
        	 grid[0][i] = initCol;
         }
         for(int i=1;i<m;i++){
        	 for(int j=1;j<n;j++){
        		 grid[i][j] = Math.min(grid[i][j]+grid[i-1][j], grid[i][j]+grid[i][j-1]);
        	 }
         }
         return grid[m-1][n-1];
    }
}
