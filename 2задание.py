import math
x=(3.74*10**(-2))
y=(-825/1000)
z=(16/100*10**2)
s=(1+math.sin(x+y)*math.sin(x+y))
r=(abs((x-(2*y)/(1+x**2*y**2))))
c=(x**(abs(y)))
j=(math.cos(math.atan(1/z))*(math.cos(math.atan(1/z))))
f=s/r*c+j
print("f={0:.5f}".format(f))
