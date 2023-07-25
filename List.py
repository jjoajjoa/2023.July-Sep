x = [1, 6, 4, 3, 7, 2, 9]

for i in range(len(x)):
    for j in range(i+1,len(x)):
        if x[i] > x[j]:
            temp = x[i]
            x[i] = x[j]
            x[j] = temp


n = len(x)  
print(n)

print(f"갯수 : {len(x)}")
print(f"최소값 : {x[0]}")
# print(f"최대값 : {x[n]}")



