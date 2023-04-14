x = [1, 3, 4, 5]
y = [2, 6, 7, 8]

x.extend(y)
print(x)
b = len(x) - 1
for i in range(b):
    for j in range(b):
        if x[j] > x[j + 1]:
            temp = x[j]
            x[j] = x[j + 1]
            x[j + 1] = temp

print(x)
