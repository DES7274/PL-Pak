def f ():
    c= int(input("вводите числа"))
    if c ==0:
        return  -10000000000000
    m=f()
    return max(c,m)
mx = f()
print(mx)
           
