package leecode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {

	
	
	 public List<TreeNode> generateTrees(int n) {
		    if(n<1) return new ArrayList<TreeNode>();
	        List<TreeNode> res = new ArrayList<TreeNode>();
	        res=helper(1,n);
	        return res;
	    }
	 public List<TreeNode> helper(int start,int end){
		 List<TreeNode> cur = new ArrayList<TreeNode>();
		 if(start>end){
			 cur.add(null);
			 return cur;
		 }
		 for(int i=start;i<=end;i++){
			 List<TreeNode> left = helper(start, i-1);
			 List<TreeNode> right = helper(i+1, end);
			 for(TreeNode l:left){
				 for(TreeNode r:right){
					 TreeNode root = new TreeNode(i);
					 root.left = l;
					 root.right = r;
					 cur.add(root);
				 }
			 }
		 }
		 return cur;
	 }
	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
}
