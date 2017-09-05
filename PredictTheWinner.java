package leecode;

import java.util.HashMap;
import java.util.Map;

public class PredictTheWinner {
public boolean PredictTheWinner(int[] nums) {
	    return find(nums, 0, nums.length-1) >= 0;
    }

 public int find(int[] nums,int left,int right){
	   if(left == right) return nums[left];
	   else return Math.max(nums[left]-find(nums, left+1, right), nums[right]-find(nums, left, right-1));
 }

}
