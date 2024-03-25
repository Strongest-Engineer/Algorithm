num = input()
sorted_num = []
for i in num:
    sorted_num.append(int(i))
sorted_num(reverse=True)
print("".join(map(str, sorted_num)))