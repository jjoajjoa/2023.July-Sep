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
def func1(param1 = 1, param2 = 2, param3 = 3):
    return 0

# 2. 키워드인자
# 함수에 전달되는 인자를 키-값 의 형태로 전달하는 것
# 순서 상관없이 키 값에 일치하는 곳에 값이 전달된다.
def greeting(name, message = "hi"):
    print(f" {message}, {name} ")
greeting(message="어쩔", name="쪼램")
greeting(name="쪼동")

# 3. 가변 인수 리스트 알브트랠리 아규먼트 리스트
# 함수에 전달되는 매개변수 앞에 (*)을 붙여서 가변인수로 지정해주는 것.
# 인자가 일렬로 나열되어 tuple형태로 전달된다.
def sum(*args):
    result = 0
    for arg in args:
        result += arg
    return result
print(sum(1,2,3))
print(sum(321,56,321,5,654,782))

# 4. 위치 인자 리스트 포지셔널 아규먼트 리스트
# 함수에 전달되는 매개변수 앞에 (**)을 붙여서 인자 리스트로 지정해주는 것.
# 만약 함수를 호출했을 경우, 키-값 쌍의 형태로 값이 전달되면, 딕셔너리 형태로 전달된다.
def greeting2(**kwargs):
    for name, message in kwargs.items():
        print(f" {message}, {name} ")
greeting2(Kim="hi", lee="hello")


# 실습02
def calc(a, *args):
    if a == "+" :
        sum = 0
        for arg in args:
            sum += arg
        return sum
    elif a == "*" :
        mult = 1
        for arg in args:
            mult *= arg
        return mult
print(calc("+",1,2,3,4,5))
print(calc("*",1,2,3,4,5))



####################### 재귀함수 ######################
# 1. 함수 내부에서 자기 자신함수를 호출해야 함
# 2. 재귀를 종료시켜주는 조건문이 존재해야 함

def test(end):
    if end == 0:
        return
    print("어쩔")
    end -= 1
    test(end)
test(5)









