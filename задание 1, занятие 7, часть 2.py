def r(a):
    if len(a) == 0:
        return a
    u=sum (a)
    c = len(a)
    o = u / c
    for i in range(len(a)):
        if a[i] == 0:
            a=[i] = o

    return a
Q=int(input("введите длину списка"))
n= [float(input("введите числа списка")) for b in range(Q)]
re = r(n)
print(re)
