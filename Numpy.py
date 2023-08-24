import numpy as np


# 2차원 배열에서 각 행과 열의 합을 구하여 리스트로 반환해보기
#이거를
# 1 2 3
# 4 5 6
# 7 8 9
#이렇게
# 6 15 24 #행
# 12 15 18 #열
a = np.array([[1,2,3],[4,5,6],[7,8,9]])
# print(a[0])
for i in a: #행
    print(i.sum(), end=" ")
print()
for i in a.transpose(): #열
    print(i.sum(), end=" ")
print()
print(a.sum(axis=None)) #기본값
print(a.sum(axis=0)) #x축
print(a.sum(axis=1)) #y축
print()


##############################################################
arr = np.random.rand(3,3)
print(arr)
print()
print(np.sort(arr)) #오름차순 정렬


##############################################################
# 10*10 배열에서 서로 다른 두 원소를 선택해서
# 두 원소의 차이의 절대값이 가장 작은 두 원소 찾아보기
print()
arr = np.random.rand(10,10)
print(arr)

































