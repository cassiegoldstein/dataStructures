def maxSubArray(nums):
    maximum = nums[0]
    for i in range(1, len(nums)):
        nums[i] = max(nums[i], nums[i]+nums[i-1])
        maximum = max(maximum, nums[i])
    return maximum



nums = [5,4,-1,7,8]
print(maxSubArray(nums))





        