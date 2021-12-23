def sumls(ls,n):
    if n==0:
        return 0
    return ls[n-1]+sumls(ls,n-1)    
  
        
ls=[1,6,7,10,8,9]
n=6
print(sumls(ls,n))
