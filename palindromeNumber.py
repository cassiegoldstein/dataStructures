def isPalindrome(x):
    revX = str(x)[::-1]
    if revX[len(revX)-1] == '-':
        revX = revX.replace('-', '')
    if(int(revX) == x):
        return True
    else: 
        return False

x = -121
print(isPalindrome(x))