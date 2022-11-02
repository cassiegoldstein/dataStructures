def romanToInt(s):
    num=0
    symbDict = {
        "I":1,
        "V":5,
        "X":10,
        "L":50,
        "C":100,
        "D":500,
        "M":1000
    }
    for i in range(len(s)): 
        if(i != len(s)-1 and symbDict[s[i]]<symbDict[s[i+1]]):
            num = num - symbDict[s[i]]
            print("less")
        else:
            num = num + symbDict[s[i]]
    return num

s = "MCMXCIV"
print(romanToInt(s))
