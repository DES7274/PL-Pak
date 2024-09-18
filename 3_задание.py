n=input("введите кол-во минут")
k=int(n)
if k>1440:
    print("в сутках нет столько минут")
elif k<=1440:
    a=k//60
    if k%60>0:
        c=k-(60*a)
    elif k%60==0:
        c=0
print("часов",a)
print("минут",c)
