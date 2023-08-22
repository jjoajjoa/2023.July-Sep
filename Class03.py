# def func(a,b):
#     print(" :-P ")
#     return a+b, a-b, a*b
# func_test = func(1, 2)
# print(func_test)


# lst = [1, 2, 3, 1, 4, 2, 1]
# def allIndex(lst, a):
#     temp = []
#     for i in range(len(lst)):
#         if a == lst[i] :
#             temp.append(i)
#     return temp
# print(allIndex(lst,1))




####################### 함수 매개변수 ######################
# 1. 기본인자값(디폴트 아규먼트 벨류스)
# 함수에 전달되는 기본 매개변수에 기본값을 지정해주는 것 : 자바에서 생성자처럼
# def func1(param1 = 1, param2 = 2, param3 = 3):
#     return 0

# 2. 키워드인자
# 함수에 전달되는 인자를 키-값 의 형태로 전달하는 것
# 순서 상관없이 키 값에 일치하는 곳에 값이 전달된다.
# def greeting(name, message = "hi"):
#     print(f" {message}, {name} ")
# greeting(message="어쩔", name="쪼램")
# greeting(name="쪼동")

# 3. 가변 인수 리스트 알브트랠리 아규먼트 리스트
# 함수에 전달되는 매개변수 앞에 (*)을 붙여서 가변인수로 지정해주는 것.
# 인자가 일렬로 나열되어 tuple형태로 전달된다.
# def sum(*args):
#     result = 0
#     for arg in args:
#         result += arg
#     return result
# print(sum(1,2,3))
# print(sum(321,56,321,5,654,782))

# 4. 위치 인자 리스트 포지셔널 아규먼트 리스트
# 함수에 전달되는 매개변수 앞에 (**)을 붙여서 인자 리스트로 지정해주는 것.
# 만약 함수를 호출했을 경우, 키-값 쌍의 형태로 값이 전달되면, 딕셔너리 형태로 전달된다.
# def greeting2(**kwargs):
#     for name, message in kwargs.items():
#         print(f" {message}, {name} ")
# greeting2(Kim="hi", lee="hello")


# 실습02
# def calc(a, *args):
#     if a == "+" :
#         sum = 0
#         for arg in args:
#             sum += arg
#         return sum
#     elif a == "*" :
#         mult = 1
#         for arg in args:
#             mult *= arg
#         return mult
# print(calc("+",1,2,3,4,5))
# print(calc("*",1,2,3,4,5))



####################### 재귀함수 Recursion Function ######################
# 1. 함수 내부에서 자기 자신함수를 호출해야 함
# 2. 재귀를 종료시켜주는 조건문이 존재해야 함

# def test(end):
#     if end == 0:
#         return
#     test(end - 1)
#     print(end)
# test(5)

# 실습03-1
# 양의 정수 n을 인자로 받아서 1부터 n까지 합을 구하는 재귀함수
# def f_sum(n):
#     if n == 1:
#         return 1
#     return n + f_sum(n-1)
# print(f_sum(5))


# 문제01
# 두 수 사이 홀수 전부 출력
# print_odd(1,10) -> 1 3 5 7 9
# print_odd(3,12) -> 3 5 7 9 11
# def odd(a, b):
#     if a == b:
#         return
#     if (a+1) %2 == 0:
#         print(a, end=" ")
#     odd(a+1, b)
# odd(3,10)



# 문제02
# 피보나치 수열
# 1 1 2 3 5 8 13 21
# fibo(6) -> 8
# def fibo(n):
#     if n==1 or n==2:
#         return 1
#     return fibo(n-1) + fibo(n-2)
# print(fibo(6))


# 문제03
# 10진수를 2진수로 변환
# bin(10) -> 2
# def bin(n):
#     if n < 2:
#         print(n%2, end="")
#         return
#     bin(n//2)
#     print(n%2, end="")
# bin(13)



# 실습03-2
# 숫자 입력받아서 높은 자리수부터 출력하기
# def f_number(n):
#     if n == 0:
#         return 0
#     f_number(n//10)
#     print(n % 10)
# f_number(1234)

############################
# lst = [ [1,2,3], [4,5,6] ]
# lstN = []
# for i in range(len(lst)):
#     for j in range(len(lst[i])):
#         lstN.append(lst[i][j])
# print(lstN) #[1, 2, 3, 4, 5, 6]

########################################################
# 이상한 리스트 -> 1차원으로 변환시키기
example = [ [1,2,3], [4, [5,6]], 7, [8,9] ]

# 반복문 사용
lst = []
for i in range(len(example)):  # 4번
    if type(example[i]) == list:
        for j in range(len(example[i])):
            if type(example[i][j]) == list:
                for k in range(len(example[i][j])):
                    lst.append(example[i][j][k])
            else:
                lst.append(example[i][j])
    else:
        lst.append(example[i])
print(lst) #[1,2,3,4,5,6,7,8,9]

# 재귀함수 사용
example = [ [1,2,3], [4, [5,6]], 7, [8,9] ]
def flatten(data):
    lst = []
    for i in data:
        # lst = []
        if type(i) == list:
            # lst = []
            lst.append(flatten(i))
            print()
        else:
            return lst.append(data[i])

    return lst
print(flatten(example))









