x=int(input("введите число х"))
n=int(input("введите число n"))
def p(x, n):
    if n == 0:
        return 1
    return x * p(x, n - 1)

def f(n):
    if n == 0:
        return 1
    return n * f(n - 1)

def c(x, n):
    if n == 0:
        return 1
    return p(x, n) / f(n)
r=c(x,n)
print(r)
