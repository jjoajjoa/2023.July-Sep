x = [1, 6, 4, 3, 7, 2, 9]


for i in range(len(x)):
    for j in range(i+1,len(x)):
        if x[i] > x[j]:
            temp = x[i]
            x[i] = x[j]
            x[j] = temp


n = int(len(x))
a = n-1

print(f"갯수 : {len(x)}")


# 최소값, 최대값
print(f"최소값 : {x[0]}")
print(f"최대값 : {x[a]}")


# 합계
## print(x)
nums = 0
for summ in x:
    nums += summ

print(f"합계 : {nums}")
b=0

for idx in range(len(x)):
    b += x[idx]

print(f"합계 : {a}")

# 평균
print(f"평균 : {int(nums/n)}")

c=0

for idx in range(len(x)):
    b += x[idx]
    c += 1

print(f"평균 : {c}")



