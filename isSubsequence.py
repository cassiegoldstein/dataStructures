def isSubsequence(s, t):
    dictS = {}
    dictT ={}
    for i in range(len(s)):
        dictS[i] = s[i]
    for i in range(len(t)):
        dictT[i] = t[i]

    dictCopy = dictT.copy()

    for key, value in dictCopy.items():
        if value not in dictS.values():
            del dictT[key]
    

    if list(dictS.values()) == list(dictT.values()):
        return True
    else:
        return False
    
   
