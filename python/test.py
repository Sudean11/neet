import pdb;
class Solution(object):
    def twoSum(self, nums, target):
        pmap = {}

        for index, value in enumerate(nums):
            diff = target - value
            if diff in pmap:
                return (index, pmap[diff])
            pmap[value] = index


print(Solution().twoSum([3,2,4], 6))