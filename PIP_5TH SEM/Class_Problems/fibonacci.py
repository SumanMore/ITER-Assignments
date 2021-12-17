n=int(input("enter a number: "))
a=0
b=1
print(a,end=" ")
print(b,end=" ")
for i in range (3,n+1):
    c=a+b
    print(c,end=" ")
    a=b
    b=c
    
    
    '''
def fibo(n):
    if n==0:
        return n
    if n==1:
        return n
    return fibo(n-1)+fibo(n-2)

print(fibo(3))  
'''
 
    
