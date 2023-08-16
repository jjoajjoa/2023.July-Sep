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


# a = int(input("단: "))
#
# if (a%2==0):
#     for i in range(2, 10, 2):
#         print(f" --------{i}단--------")
#         for j in range(1, 10):
#             print(f" {i} X {j} =  {i*j}")
#         print()
# else :
#     for i in range(1, 10, 2):
#         print(f" --------{i}단--------")
#         for j in range(1, 10):
#             print(f" {i} X {j} =  {i*j}")
#         print()


# a = int(input("단: "))
#
# for i in range(a, 10, 1):
#     print(f" --------{a}단--------")
#     for j in range(1, 10):
#         print(f" {a} X {j} =  {i*j}")
#     print()





#Hello world -> Hell wrld
s = "Hello world" # Hello world\n
# n = 123

print(s.replace('o', '')) #Hell wrld

lst = list(s)
# lst2 = lst(n)
print(lst, " <- lst") #['H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd']
# print(lst2, " <- lst2")

for i in lst:
    if(i == 'o'):
        continue
    print(i, end="") #print(i, end="\n") #Hell wrld

print()
print(lst[0:4] + lst[5:7] + lst[8:len(lst)-1]) #['H', 'e', 'l', 'l', ' ', 'w', 'r', 'l']
#lst[0:4] = "Hell"
#lst[5:7] = " w"
#lst[8:len(lst)-1] = "rld"

s = "" #초기화

for i in lst[:4] + lst[5:7] + lst[8:]:
    s += i

print(s) #Hell wrld

s = "" #초기화
for i in lst:
    if(i == 'o'):
        continue
    s += i
print(s) #Hell wrld

print(lst[0:4] + lst[5:7] + lst[8:len(lst)-1]) #['H', 'e', 'l', 'l', ' ', 'w', 'r', 'l']

lst2 = []
start = 0
for i in range(len(lst)):
    if lst[i] == 'o' or i == len(lst)-1:
        lst2 += lst[start:i] #(0,4) (5,7) (8,len-1)
        start = i+1

print(lst2)


lst = list("hellooooo wooooorld") #문제: 값이 하나 지워질때마다 사이즈가 변하고있음
                                #앞에 있으면 지우고 뒤에꺼를 넘어가서 짝수번째만 출력됨
                                #해결: 삭제하면 삭제한위치를 다시 보라고 컴한테 시켜줌
i = 0
while(True) :
    if (i == (len(lst))):
        break

    if lst[i] == "o":
        del lst[i]
    else :
        i+= 1

print(lst)

lst = list("oooooooooooooo")
for j in range(len(lst)):
    for i in range(len(lst)):
        if (lst[i] == "o") :
            del lst[i]
            break





x = int(input("찾고자 하는 값: "))
a = [1, 1, 2, 2, 3, 3]
# print(a.count(x))   # 3 -> 2
# 1. count 함수 원리 구현해보기
count = 0
for i in range(len(a)) :
    if (x==a[i]):
        count += 1
print(count)



a = [1, 2, 3, 4, 5]
# a.reverse()
# print(a)
# 2. reverse 함수 원리 구현해보기
b = []
for i in range(len(a)-1, -1, -1):
    b.append(a[i])
print(b)

# 좌우 대칭으로 자리 바꿔주기
start, end = 0 , len(a)-1
temp = 0 #잠시 옮겨놓는 변수
while (end > start):
    temp = a[start]
    a[start] = a[end]
    a[end] = temp #a[start], a[end] = a[end], a[start]
    start += 1
    end -= 1
print(a)

# for문 사용
for i in range(len(a)//2):
    tem = a[i]
    a[i] = a[len(a)-i-1]
    a[len(a)-i-1] = tem
print(a)



# 3. list 함수 원리 숫자로 구현해보기
t = 123456
# lst = list(s)
# print(lst)
cnt = 0
for i in range(1, 6) :
    if ( (t/10) > 0) :
        cnt += 1

print(cnt) # 5

# for i in range(1,cnt+1) :
n = t // ((cnt)*10000)
print(n)
# lst = list(n)
# print(lst)

# 2X5 이차원 리스트 만들어서 1~10까지 채우기
lst = [[0,0],[0,0],[0,0],[0,0],[0,0]]

