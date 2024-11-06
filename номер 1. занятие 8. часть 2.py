def a(ar):
    t = sum(ar)
    av = t / len(ar) if ar else 0
    return t, av
ar1 = [1, 2, 3, 4, 5]
ar2 = [6, 7, 8, 9, 10, 11, 12]
ar3 = [13, 14, 15]
for i, array in enumerate([ar1, ar2, ar3], start=1):
    t, av = a(array)
    print(f"Массив {i}:")
    print(f"  Сумма элементов: ",t)
    print(f"  Среднеарифметическое значение: ",av)
