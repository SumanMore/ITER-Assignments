'''
def reverse(str1):
    str=' '
    for i in range(len(str1)):
        str=str1[i]+str
    return str
s=input("enter the string\n")
res=reverse(s)
print("the reversed string is:", res)
'''



def reverse(str1):
    if str1=='':
        return str1
    else:
        return reverse(str1[1:])+str1[0]
s=input("enter the string\n")
res=reverse(s)
print("the reversed string is:", res)        
        
