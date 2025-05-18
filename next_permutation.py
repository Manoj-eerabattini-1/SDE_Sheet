# https://leetcode.com/problems/next-permutation/description/

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        idx = -1
        n = len(nums)
        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                idx = i
                break
        if idx == -1: self.rev(nums, 0, n - 1)
        else:
            for i in range(n - 1, idx - 1, -1):
                if nums[i] > nums[idx]:
                    t = nums[i]
                    nums[i] = nums[idx]
                    nums[idx] = t
                    break
            self.rev(nums, idx + 1, n - 1)
    def rev(self, nums: List[int], a: int, b: int) -> None:
        l, r = a, b
        while l < r:
            t = nums[l]
            nums[l] = nums[r]
            nums[r] = t
            l += 1
            r -= 1
        return
