from curses import keyname


def twoSum(nums, target):
    dict = {}
    array = []
    for i in range(len(nums)):
        toFind = target - nums[i]
        if toFind in dict.keys():
            array.append(dict[toFind])
            array.append(i) 
            return array
        else:
            dict[nums[i]] = i
        
    
    







nums = [3,2,4]
target = 6
print(twoSum(nums,target))