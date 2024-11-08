n=int(input('введите кол-во строчек'))
m=int(input('введите кол-во столбцов'))
a = []
for i in range(n):
    b=[]
    for i in range(m):
        b.append(int(input("введите цифры для матрицы")))
    a.append(b)
for row in  a:
        ma = row.index(max(row))
        mi = row.index (min(row))
        row[-1], row[ma] = row[ma],row[-1]
        row[0], row[mi] = row[mi],row[0]
        

for i in range(n):
    for j in range(m):
        print(a[i][j], end='')
    print()

      
