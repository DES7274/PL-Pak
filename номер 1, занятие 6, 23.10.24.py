t= input("введите текст")
w=t.lower().split()
c=0
for i in w :
   if i.startswith("е"):
       c +=1
print("коллво слов , начинающихся с буквы е",c)
