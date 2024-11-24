n=int(input('введите кол-во строчек'))
m=int(input('введите кол-во столбцов'))
a = []
for i in range(n):
    b=[]
    for i in range(m):
        b.append(int(input("введите цифры для матрицы")))
    a.append(b)
with open ("Пак Егор Сергеевич_у-243_vvod(2).txt",'w') as file:
    file.write(str(a))
