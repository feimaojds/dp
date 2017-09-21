package leecode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningII {

public int minCut(String s) {
	    if(s == null || s.length() == 0 ) return 0;
        int[] d = new int[s.length()];
        boolean[][] pal = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
        	for(int j=0;j<s.length();j++){
        		pal[i][j] = false;
        	}
        }
        for(int i=s.length()-1;i>=0;i--){
        	d[i] = s.length()-i-1;
        	for(int j=i;j<s.length();j++){
        		if(s.charAt(i)==s.charAt(j) && (j-i<=2 || pal[i+1][j-1]== true)){
        			pal[i][j] = true;
        			if(j == s.length()-1) d[i] = 0;
        			else if(d[i]>1+d[j+1]) d[i] = 1+d[j+1];
        		}
        	}
        }
        return d[0];
    }


}
