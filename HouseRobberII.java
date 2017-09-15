package leecode;

public class HouseRobberII {

	
public int rob(int[] nums) {
        if(nums.length == 0 ) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(robLine(nums, 0, nums.length-2),robLine(nums, 1, nums.length-1));
    }

public int robLine(int[] nums,int start,int end){
	int length = end-start+1;
	int[] dp = new int[nums.length];
	if(length == 1) return nums[start];
	if(length == 2) return Math.max(nums[start], nums[end]);
	dp[start] = nums[start];
	dp[start+1] = Math.max(nums[start], nums[end]);
	
	for(int i=start+2;i<=end;i++){
		dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		System.out.println(dp[i]);
	}
	return dp[end];
}

}
