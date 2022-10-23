def merge(nums1, m, nums2, n):
    lastPosition = m + n -1
    while m > 0 and n > 0:
        if nums1[m-1] > nums2[n-1]:
            nums1[lastPosition] = nums1[m-1]
            m -= 1
        else:
            nums1[lastPosition] = nums2[n-1]
            n -= 1
        lastPosition -= 1
    while n > 0:
        nums1[lastPosition] = nums2[n-1]
        n -= 1
        lastPosition -= 1
    return nums1





nums1= [2,2,3,0,0,0]
nums2 = [1,5,6]
m = 3
n = 3
print(merge(nums1, m, nums2, n))
