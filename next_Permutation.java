// https://leetcode.com/problems/next-permutation/description/

class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if(ind == -1) {
            rev(nums, 0, n - 1);
        } else {
            for(int i = n - 1; i >= ind; i--) {
                if(nums[i] > nums[ind]) {
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }
            rev(nums, ind + 1, n - 1);
        }
    }
    public static void rev(int[] nums, int a, int b) {
        int l = a, r = b;
        while(l < r) {
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
        return;
    }
}
