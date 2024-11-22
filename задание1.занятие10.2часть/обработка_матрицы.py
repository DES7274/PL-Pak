

with open('C:\\Users\\DESY_DING\\Desktop\\matrix\\Пак Егор Сергеевич_у-243_vvod(2).txt', 'r') as file:
    lines = file.readlines()

matrix = []
for line in lines:
    cl = line.replace('[', '').replace(']', '').replace(',', '').strip()  
    if cl:  
        row = list(map(int, cl.split()))  
        matrix.append(row)

l = 0
s = 0


n = len(matrix)
m = len(matrix[0]) if matrix else 0


for row in matrix:
    if row: 
        ma = row.index(max(row))  
        mi = row.index(min(row))
        row[-1], row[ma] = row[ma], row[-1]
        
        row[0], row[mi] = row[mi], row[0]


for i in range(n):
    for j in range(m):
        if i < j:  
            if matrix[i][j] >= 0:  
                s += matrix[i][j]
                l += 1


for i in range(n):
    for j in range(m):
        print(matrix[i][j], end=' ')
    print()  

out_file_path = "E:\\documents\\GitHub\\PL-Pak\\задание1.занятие10.2часть\\Пак Егор Сергеевич_у-243_vivod(2).txt"
with open(out_file_path, 'w') as out_file: 
    out_file.write(f'Количество элементов выше главной диагонали: {l}\n')
    out_file.write(f'Сумма этих элементов: {s}\n')

