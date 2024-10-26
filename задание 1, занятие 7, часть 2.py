def r(a):

    no= [x for x in a if x != 0]

    if no:
        av = sum(no) / len(no)
    else:
        av= 0

    for i in range(len(a)):
        if a[i] == 0:
            a[i] = av

    return a


n= int (input("введите длину списка"))
c = [float(input("введите числа ")) for  x in range(n)]
up = r(c)
print(up)