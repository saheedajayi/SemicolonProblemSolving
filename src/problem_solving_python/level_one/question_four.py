letter = "mississippi"
number = 0
length = len(letter) - 1
for i in range(length + 1):
    if letter[i] == "m":
        number += 1
    if letter[i] == "i":
        number += 1

print(number)
