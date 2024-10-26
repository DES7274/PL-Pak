n=int(input("введите число"))
c=0
while c<n:
    c=c**2
    print(c)
    c=c+1
    if c**2>=n:
        break
print("квадрат больше введеного")
        
