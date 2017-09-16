package leecode;

public class LongestPalindromicSequence {
	 public int longestPalindromeSubseq(String s) {
		    if(s.length()==0 || s.length() ==1) return s.length();
	        char[] c = s.toCharArray();
	        int n = s.length();
	        int[][] dp = new int[n][n];
	        for(int i=n-1;i>=0;i--){
	        	dp[i][i] = 1;
	        	for(int j = i+1;j<n;j++){
	        		if(c[i] == c[j]){
	        			dp[i][j] = 2 +dp[i+1][j-1];
	        		}else{
	        			dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
	        		}
	        	}
	        }
	        return dp[0][n-1];
	    }

}
