# x = ["A", "B", "C", "B"]
#
# print(x)
# # print(x.append("a"))
# x.append("a")
# print(x)
# x.extend(["a", "b"])
# print(x)
# x.insert(1, "a")
# print(x)
# x.remove("B")
# print(x)
# x.pop()
# print(x)
#
# print(x.index("B"))
# print(x.count("a"))
#
# x.sort()
# print(x)
# x.reverse()
# print(x)


############### Dict ######################

# lst = []
# name = input("이름: ")
# age = int(input("나이: "))
# phoneNum = input("연락처: ")
#
# dic = { "name":name, "age":age, "phoneNum":phoneNum }
# print(dic)
# lst.append(dic)
#
#
# lst = []
# while (True):
#     name = input("이름: ")
#     age = int(input("나이: "))
#     phoneNum = input("연락처: ")
#
#     if age == 0:
#         break
#
#     dic = {"name": name, "age": age, "phoneNum": phoneNum}
#     lst.append(dic)
# print(lst)


################# SET #####################

# s = {1, 2, 3}
# s.add(3)
# print(s)

# 실습01
# 사람 3명이 각각 먹고 싶은 음식이 여러개 있을 때,
# 어떤 메뉴를 시키는게 가장 좋을지 (교집합)
# tom = {"fish", "beef", "vegemil", "bread"}
# jerry = {"cheese", "meatBall", "vegemil"}
# jjo = {"salmon", "gadarangFish", "bread", "vegemil"}
# print(tom & jerry & jjo)
# print( (tom & jerry) | (tom & jjo) | (jerry & jjo) )

# tom = ["fish", "beef", "vegemil", "bread"]
# jerry = ["cheese", "meatBall", "vegemil"]
# jjo = ["salmon", "gadarangFish", "bread", "vegemil"]
# menu1 = set(tom)
# menu2 = set(jerry)
# menu3 = set(jjo)



# 실습02
# 사람 3명이 각각 음식을 여러개 가지고 있을 때,
# 두명이 서로 음식을 교환해보기
# 이미 갖고있는 음식이라면 교환 X
# 실습02-1
# 리스트 상태에서 3명의 공통음식 찾기
#
# 실습02 풀이
# tom = {"fish", "beef", "vegemil", "bread"}
# jerry = {"cheese", "meatBall", "vegemil"}
# jjo = {"salmon", "gadarangFish", "bread", "vegemil"}
#
# while (True) :
#     print("Hi, tom")
#     setInput = int(input("1.교환 // 2. 종료  :  "))
#
#     if (setInput == 1) :
#         setInput = int(input("누구랑: 1.jerry // 2. jjo  :  "))
#         if (setInput == 1) : #jerry
#             tomInput = input("내꺼머를: ")
#             jerryInput = input("너꺼머랑: ")
#
#             if (jerryInput in tom) :
#                 print("ㄴㄴ")
#             elif (tomInput in jerry) :
#                 print("ㄴㄴ")
#             else :
#                 tom.add(jerryInput)
#                 tom.remove(tomInput)
#                 print("교환성공 tom: ", tom)
#                 jerry.add(tomInput)
#                 jerry.remove(tomInput)
#                 print("교환성공 jerry: ", jerry)
#
#         elif (setInput == 2):
#             tomPocket = tom^jjo
#             print("교환성공 tom: " , tomPocket)
#             jjoPocket = tom & jjo
#             print("교환성공 jjo: ", jjoPocket)
#         else:
#             print("메롱")
#
#     elif (setInput == 2) :
#         break
#
#     else :
#         print("메롱")

# # 실습02-1 풀이
# p1 = ["피자"]
# p2 = ["피자", "햄버거"]
# p3 = ["피자", "팝콘", "치킨"]
# #젤간단하게
# for i in p1:
#     for j in p2:
#         for k in p3:
#             # if (i==j) & (j==k) & (i==k):
#             if (i==j==k):
#                 print(i)
# #이러캐
# for i in p1:
#     if i in p2 and i in p3:
#         print(i)
# #또는 이러캐
# for i in p1:
#     for j in p2:
#         if (i==j):
#             for k in p3:
#                 if (i==k):
#                     print(i)


################# List #####################
# lst = [1,2,3,4,5,6,7,8,9]
#
# for i in lst:
#     print(i)
#
# maxNum = lst[0]
# minNum = lst[0]
# sumNum = 0
#
# print(min(lst))
# print(max(lst))
# print(sum(lst))
# # 위에꺼 함수없이 구현하기
#
# for i in lst :
#     if minNum > i:
#         minNum = i
#     if maxNum < i:
#         maxNum = i
#     sumNum += i
# print(minNum, maxNum, sumNum)


################# Split, Join #####################

# fruit = "사과,배,옥수수,당근"
#
# fruit_list = fruit.split(",")
# print(fruit_list)
#
# fruit = "-".join(fruit_list)
# print(fruit)

# 위에꺼 이것저것 섞여있을때도 써야하니까 함수없이 구현하기
# fruit = "apple,pear,corn,carrot"
# fruit_list = []
# s = ""
# for i in (fruit) :
#     if (i == ",") :
#         fruit_list.append(s)
#         s = ""
#     else :
#         s += i
# fruit_list.append(s)
# print(fruit_list)

# 슬라이싱 사용해보기
# fruit = "apple,pear,corn,carrot"
# fruit_list = []
# s = 0
# for i in range(len(fruit)) :
#     if (fruit[i] == ",") :
#         fruit_list.append(fruit[s:i])
#         s = i+1
# fruit_list.append(fruit[s:len(fruit)])
# print(fruit_list)


# 아스키코드 사용해보기
# fruit = "apple+-pear,.54-corn,!12?carrot"
# fruit_list = []
# # print(int("a")) # 파이썬은 이렇게하면 안나옴
# print(ord("a"))
# print(chr(97))
# for i in range(len(fruit)) :
#     if not ((ord(fruit[i] >= 65) and ord(fruit[i] <= 90)) or (ord(fruit[i] >= 97) and ord(fruit[i] <= 122))):
#         fruit_list.append(fruit[s:i])
#         s = i+1
# fruit_list.append(fruit[s:len(fruit)])
# print(fruit_list)
# ###밑에꺼로보기
# fruit = "apple,./+pear-25-corn,carrot"
# fruit_list = []
# s = 0
# for i in range(len(fruit)):
#     if not((ord(fruit[i]) >= 65 and ord(fruit[i]) <= 90) or (ord(fruit[i]) >= 97 and ord(fruit[i]) <= 122)):
#         if fruit[s:i] != "": # s != i-1
#             fruit_list.append(fruit[s:i])
#         s = i + 1
# fruit_list.append(fruit[s:len(fruit)])
# print(fruit_list)


# 단어구분이 안되어있다면(구분자가 없다면), 단어DB가 있어야함: 어떠캐하까
# fruit = "carrotapplepearcorn"
# fruit_list = ["apple", "pear", "corn", "carrot"] #임시DB
# lst = []
#
# s = ""
# for i in (fruit) :
#     s += i
#     # for j in fruit_list :
#     #     if s == j:  #아랫줄 사실 이거임
#     if s in fruit_list :
#         lst.append(s)
#         s = ""
# if s in fruit_list :
#     lst.append(s)
# print(lst)



################# List Comprehension #####################

# a = [ i for i in range(10) ]
# print(a)
#
# a = [ i for i in range(10) if i%2==0 ]
# print(a)
#
# a = [ i*j for i in range(2,10) for j in range(1,10) ]
# print(a)


# 실습00
# lst = [i*0 for i in range(10)]
# print(lst)

# 실습01,02
# word = ["school", "game", "piano", "science", "hotel", "mountain"]
# lst1 = [ i for i in word if len(i)>=6 ]
# print(lst1)
# lst2 = [len(i) for i in word]
# print(lst2)


################# Comprehension Test #####################

# 실습01
# a = [ [10,20], [30,40], [50,60] ]
# b = [  [2,3],   [4,5],    [6,7] ]
# lst = []
# lstN = []
# for i in range(len(a)):
#     for j in range(len(a[i])):
#         x = a[i][j] * b[i][j]
#         lst.append(x)
#     lstN.append(lst)
#     lst = []
# print(lstN)


# #실습02
# # [ [1,2], [3,4], [5,6] ]
# a = [[i+1 for i in range(10)] for j in range(10)]
# b = [[j*10 +i+1 for i in range(10)] for j in range(10)]
# print(a)
# print(b)
# c = [[i+1 for i in range(2)] for j in range(3)]
# print(c)
# d = [[j*2 +i+1 for i in range(2)] for j in range(3)]
# print(d)


# #실습03
# # 2차원배열 10*10에 0으로 채우는거
# a = [[0 for i in range(10)] for _ in range(10)]


#실습04
# 100 이하의 소수로 이루어진 1차원리스트
# a = [i for i in range(0,100) if (i%2==1)  ]
# print(a)

# 먼저 반복문 사용해서 채워보기
lst = []
for i in range(2,101) : #1~100까지중에
    for j in range(2, i) : #j는 약수찾는 임무 수행
        if (i%j == 0) :
            break
        # else: #반복문이 끝낫을때: j가 i까지 도착햇을때
        #     print(i, end=" ")
        elif (i-1 == j) :
            lst.append(i)
print(lst)

# 리스트 컴프리헨션 사용해보기
prime_number = [ i for i in range(2, 101) if i%j !=0 for j in range(2,i) ]
print(prime_number)



# -> all함수, any함수
# 여러개의 조건 or 값이 있는 리스트, 튜플, set ... 값의 조건에 따라 T or F 값을 리턴하는 함수
# all함수: 모든값이 T 일 때 T
# any함수: 하나라도 T면 T
# 위에 애를 이러캐 써보기
number = [i+1 for i in range(10)] # 1~10
lst = [x for x in number if x%2==0] # ~10 짝수
# all함수
res = all(x%2==0 for x in number)
print(res) #F
res = all(x%2==0 for x in lst)
print(res) #T
# any함수
res = any(x==5 for x in number)
print(res) #T
res = any(x==5 for x in lst)
print(res) #F


################# 별 출력하기 #####################

