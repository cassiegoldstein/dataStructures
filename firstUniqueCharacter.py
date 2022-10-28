def firstUniqChar(s):
    map = {}
    for i in range(len(s)):
        if s[i] in map:
            map[s[i]] += 1
        else:
            map[s[i]] = 1
    for key in list(map.keys()):
        v = map.get(key)
        if v > 1:
            del map[key]
    if len(map) > 0:
        char = list(map.keys())[0]
        return s.index(char)
    else:
        return -1


        
            


s = "leetcode"
print(firstUniqChar(s))