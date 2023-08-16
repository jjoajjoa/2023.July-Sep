# x = int(input("점수1: "))
# y = int(input("점수2: "))
# z = int(input("점수3: "))
#
# print(x>65 and y>65 and z>65)

# print("과일"*3)

# word = "Apple Banana"
# print(len(word))
# print(word.replace("Banana","Orange"))
# print(word)
# print(word.upper())
# print(word.lower())
# print(word.replace(" ",""))

# score = int(input("점수: "))
# if (score >= 90):
#     print("추카")
# else:
#     print("메롱")

# for i in range(10):
#     print(i)

# range(1.처음, 2.끝, 3.중간)
#1. 어디부터 시작할래
#2. 어디까지 할래
#3. 어떻게 진행할래
## 1, 3 생략 가능

# x = int(input("단: "))
# print(f" --------{x}단--------")
# for i in range(1, 10):
#     print(f" {x} X {i} = {x*i} ")
#
# for i in range(1, 10):
#     print(f" --------{i}단--------")
#     for j in range(1, 10):
#         print(f" {i} X {j} =  {i*j}")

# x = 1
# a = 0
# while (x != 0):
#     x = int(input("값: "))
#     a += x
# print(f"합계 : {a}")

# x = 0
# a = 0
# while (True):
#     x = int(input("값: "))
#     a += x
#     if (x == 0):
#       break
# print(f"합계 : {a}")


x = int(input("단: "))
while(True):
    if (x%2==1):

        print(f" --------{x}단--------")
        for i in range(1, 10):
            print(f" {x} X {i} = {x*i} ")