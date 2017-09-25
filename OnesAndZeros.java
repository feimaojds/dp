package leecode;

public class OnesAndZeros {

	
	 public int findMaxForm(String[] strs, int m, int n) {
	        if(strs == null || strs.length == 0 ) return 0;
	        int[][] dp = new int[m+1][n+1];
	        for(String s : strs){
	        	int[] count = new int[2];
	        	for(int i=0;i<s.length();i++){
	        		count[s.charAt(i)-'0']++;
	        	}
	        	for(int i=m;i>=count[0];i--){
	        		for(int j=n;j>=count[1];j--){
                         dp[i][j] = Math.max(dp[i][j], 1+dp[i-count[0]][j-count[1]]);
	        	}
	        }
	    }
	        return dp[m][n];
	 }
}
