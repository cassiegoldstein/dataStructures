def canConstruct(ransomNote, magazine):
    dictMag = {}
    dictNote = {}
    boolean = True
    for i in range(len(magazine)):
        if magazine[i] not in dictMag:
            dictMag[magazine[i]] = 1
        else:
            dictMag[magazine[i]] += 1

    for i in range(len(ransomNote)):
        if ransomNote[i] not in dictNote:
            dictNote[ransomNote[i]] = 1
        else:
            dictNote[ransomNote[i]] += 1
    print(dictNote)
    print(dictMag)
    for key in dictNote:
        if key in dictMag:
            val = dictNote.get(key)
            if val <= dictMag.get(key):
                boolean = True
            else:
                boolean = False
                return boolean
        else:
            boolean = False
            return boolean
    return boolean

       

ransomNote = "fihjjjjei"
magazine = "hjibagacbhadfaefdjaeaebgi"
print(canConstruct(ransomNote, magazine))