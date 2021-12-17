'''
n=int(input("enter a number"))
f=1
for i in range(1,n+1):
    f=f*i
print(f)   
'''

def fact(n):
    if n==0:
        return 1
    return n*fact(n-1)
n=0
print(fact(n))
        
