class Solution {
    public int findMin(int[] nums) {
        
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<e){
            int mid = (s+e)/2;

            if(nums[mid] <=nums[e]){
                ans = mid;
                e = mid;
            }else s = mid+1;
        }

        return nums[s];


    }
}


//T.C -> O(log n)
//S.C -> O(1)