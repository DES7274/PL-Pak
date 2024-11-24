
with open('Пак Егор Сергеевич_у-243_vvod.txt', 'r') as file:
    lines = file.readlines()


matrix = []
for line in lines:
    cl = line.replace('[', '').replace(']', '').replace(',', '').strip()
    if cl:
        row = list(map(int, cl.split()))
        matrix.append(row)


n = len(matrix)

l = 0
s = 0

for i in range(n):
    for j in range(n):
        if i < j:
            print(f"Проверяем элемент matrix[{i}][{j}] = {matrix[i][j]}")  
            if matrix[i][j] >= 0:
                s += matrix[i][j]
                l += 1

print(l, s)

out_file = 'Пак Егор Сергеевич_у-243_vivod.txt'
with open(out_file, 'w') as out_file:  
    out_file.write(f'Количество элементов выше главной диагонали: {l}\n')
    out_file.write(f'Сумма этих элементов: {s}\n')


