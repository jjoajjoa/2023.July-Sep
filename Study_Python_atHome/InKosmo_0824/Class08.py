import numpy as np

arr = np.random.rand(10,10)
# print(arr)
print(np.sort(arr))
print()


# for i in range(len(arr)):
#     print(arr[i].sum(), end=" ")
# print()
lst = []
temp = []
for i in range(10):
    for j in range(10):
        x = arr[i][j]*arr[i][j]
        temp.append(x)
    lst.append(temp)
    temp = []
print(lst)