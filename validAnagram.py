def isAnagram(s, t):
    sSort = ''.join(sorted(s))
    tSort = ''.join(sorted(t))
    if sSort == tSort:
        return True
    else:
        return False


s = "anagram"
t ="nagaram"
print(isAnagram(s,t))