
def linearsearch(lst , key):
        for i in range(0,len(lst)):
            if lst[i]==key:
               return i
        return None
lst=[3,1,7,0,8]
a=linearsearch(lst,7)
print(a)
