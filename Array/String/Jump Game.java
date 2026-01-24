class Solution {
    public Boolean dp [];
    public boolean canJump(int[] nums) {
        dp=  new Boolean [nums.length];
        return solve(0, nums);
    }


    public boolean solve(int idx, int nums[]){

        if( idx == nums.length-1) return true;
        if( idx>=nums.length) return false;
        if(nums[idx] == 0) return false;
        if(dp[idx]!=null) return dp[idx];
        for(int i = 1 ; i<=nums[idx] ; i++){
            if(solve(idx+i,nums)) return dp[idx]=true;
        }

        return dp[idx]=false;
    }
}

//T.C -> O(N^2)
//S.C -> O(N) for dp array + O(N) for recursion stack