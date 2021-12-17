
'''
n=int(input("enter a no"))
sum=0
for i in range(1,n+1):
     sum=sum+i
print(sum) 
'''


def sumno(n):
    if n<=1:
        return n;
    return n+sumno(n-1)    
print(sumno(5))    

    
