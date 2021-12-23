
list2=[]
def flatten(ls):
    for i in ls:
        if type(i) != list:
            list2.append(i)
        else:
            flatten(i)
    return list2        
            
    
        
ls=[1,[6,7],[10],8,9]
print(flatten(ls))

