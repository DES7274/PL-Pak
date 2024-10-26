n=int(input("введите размер списка"))
x=[int(input("введите список")) for i in range(n)]
m=max(x)
x.reverse()
print("максимальное число:",m)
print("список наоборот:",x)
