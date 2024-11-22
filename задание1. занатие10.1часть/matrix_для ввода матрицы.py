n = int (input('введите число строк и столбцов' ))
a=[]
for i in range(n):
    b = []
    for j in range(n):
        b.append(int (input('введите значения для массива')))
    a.append(b)
with open ("C:\\Users\\DESY_DING\\Desktop\\matrix\\Пак Егор Сергеевич_у-243_vvod.txt",'w') as file:
    file.write(str(a))
