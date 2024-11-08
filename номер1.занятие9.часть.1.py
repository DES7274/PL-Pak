n = int (input('введите число строк и столбцов' ))
a=[]
for i in range(n):
    b = []
    for j in range(n):
        b.append(int (input('введите значения для массива')))
    a.append(b)


l=0
s=0
for i in range(n):
    for j in range(n):
    
        if ((i<j) and (a[i][j]>=0)):
            s+=(a[i][j])
            l+=1
        else:
            s+=0
        l+=0
print(l,s)
        
  
   
        
        


    
