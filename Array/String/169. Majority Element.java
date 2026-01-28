import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length-1;
        int mid = s+(e-s)/2;
        return nums[mid];  
    }
}

//T.C -> O(N log N)
//S.C -> O(1)