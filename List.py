x = [1, 6, 4, 3, 7, 2, 9]

# 최소값
for i in range(len(x)):
    for j in range(i+1,len(x)):
        if x[i] > x[j]:
            temp = x[i]
            x[i] = x[j]
            x[j] = temp


n = int(len(x))
a = n-1

print(f"갯수 : {len(x)}")
print(f"최소값 : {x[0]}")
print(f"최대값 : {x[a]}")

# 최대값


# 합계
b=0

for idx in range(len(x)):
    a += x[idx]

print(f"합계 : {a}")

# 평균

c=0

for idx in range(len(x)):
    a += x[idx]
    c += 1

print(f"평균 : {c}")



