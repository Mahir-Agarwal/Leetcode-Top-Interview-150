

class Solution {

    public int dp[] ;
    public int jump(int[] nums) {
        
        dp = new int [nums.length] ; 
        Arrays.fill(dp , -1 );
        return solve( 0, nums);
    }

    public int solve(int i , int nums[]){

        if( i >= nums.length-1 ) return 0 ;

        int min = Integer.MAX_VALUE;
        if(dp[i] != -1) return dp[i];
        for(int idx =1 ;  idx <= nums[i]  ; idx++){

            int take = idx+ i ;

            if(take < nums.length ){
                int res = solve(take , nums);
                if(res !=Integer.MAX_VALUE) min =Math.min( min , 1+ res);
            }
        }

        return dp[i] = min ; 
    }
}

