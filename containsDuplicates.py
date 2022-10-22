def containsDuplicate(nums):
    noDups = set(nums)
    if len(noDups) < len(nums):
        return True
    else:
        return False
        

print(containsDuplicate([1,2,3,1]))