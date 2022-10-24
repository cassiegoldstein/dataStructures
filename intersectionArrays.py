from tkinter import N


def intersect(nums1, nums2):
    dict = {}
    ans = []
    for elem in max(nums1,nums2):
        if elem in dict:
            dict[elem] += 1
        else:
            dict[elem] = 1
    for elem in min(nums1, nums2):
        if elem in dict and dict[elem] > 0:
            dict[elem] -= 1
            ans.append(elem)
    return ans   








nums1 = [4,9,5,9]
nums2 = [9,4,9,8,7]
print(intersect(nums1, nums2))