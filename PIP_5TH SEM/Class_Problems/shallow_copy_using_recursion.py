
def copy(list1,list2=[]):
    if list1==[]:
        return list2
    else:
        list2.append(list1[0])
        copy(list1[1:],list2)
    return list2    
list1=[1,2,3,4,8]
list2=copy(list1)
print(list2)
