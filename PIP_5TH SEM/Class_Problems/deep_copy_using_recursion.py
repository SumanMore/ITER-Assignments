def deepcopy(list1,list2=[]):
    if list1==[]:
        pass
    else:
        if type(list1[0])!=list:
           list2.append(list1[0])
        else:
            list2.append([])
            deepcopy(list1[0],list2[-1])
        deepcopy(list1[1:],list2)    
    return list2         
          
list1=[1,2,[3,16],4,8]
list2=deepcopy(list1)
print(list2)
list1[2][1]=0
print(list1)
print(list2)
