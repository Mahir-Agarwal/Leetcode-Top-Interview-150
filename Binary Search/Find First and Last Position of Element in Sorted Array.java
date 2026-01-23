class Solution {
    public int[] searchRange(int[] nums, int target) {

        int res[] = new int[2];
        Arrays.fill(res, -1);

        res[0] = binarySF(nums, target);
        if (res[0] == -1) return res;

        res[1] = binarySL(nums, target);
        return res;
    }

    public int binarySF(int nums[], int tar) {

        int s = 0, e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == tar) {
                ans = mid;
                e = mid - 1;   // move left
            } else if (nums[mid] < tar) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public int binarySL(int nums[], int tar) {

        int s = 0, e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == tar) {
                ans = mid;
                s = mid + 1;   // move right
            } else if (nums[mid] < tar) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}

//T.C- > O(log n)
//S.C- > O(1)