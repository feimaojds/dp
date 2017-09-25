package leecode;

public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
	     int low = 0,high = nums.length-1;
        
	     while(low<high){
             if(nums[low]<nums[high]) return nums[low];
	    	 int mid = low+(high-low)/2;
	    	 if(nums[mid]>=nums[low]) low = mid+1;
	    	 else high = mid;
	     }
	     return nums[low];
    }
}
