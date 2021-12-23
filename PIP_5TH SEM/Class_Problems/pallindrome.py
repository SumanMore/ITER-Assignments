def pallindrome(s):
    if s=="":
        return True
    elif s[0]!=s[-1]:
        return False
    else:
        return pallindrome(s[1:-1])
        
        
s=input("Enter a string ")
print(pallindrome(s))
