########### 람다 Lambda 표현식 ###########

# 람다: 익명함수를 생성하는 키워드
# 코드를 짧게 만드는데 사용
# 간단한 함수를 만든다고 할 때, 매개변수 return def... 가 너무 번거롭기 때문에 사용

# lambda arguments: expression
def add(x, y):
    return x+y

add_lambda = lambda x,y: x+y
# (lambda 키워드) + (arguments 매개변수 x, y) + (expression 표현식 x+y)

print(add(3,4))
print(add_lambda(3,4))

## map 함수 (파이썬 내장함수)
# 주어진 함수를 반복 가능한(interable) 객체(리플, 스트링 등)의 각 원소에 적용하고, 결과를 반환
# 리스트 컴프리헨션과 비슷

# map(function, interable) -> 원래 객체의 각 원소에 해당함수를 적용한 결과

def square(x):
    return x * x

lst = [1,2,3,4,5]
# square_list = map(square, lst)
# lst = list(square_list)
square_list = map(lambda x: x*x, lst)
lst = list(square_list)
print(lst)


## filter함수 (파이썬 내장함수)
# 주어진 함수를 반복 가능한(interable) 객체(리플, 스트링 등)의 결과가 참인 원소들만 반환

# filter(function, interable)

def is_even(x): #리턴값이 boolean
    return x%2 == 0
lst = [1,2,3,4,5]
even_lst = filter(is_even, lst)
even_lst = filter(lambda x: x%2==0, lst)
print(even_lst)
print(list(even_lst))




# 실습04-1
# 람다, 맵 사용해서 60이상-합격, 50~60-대기, 50이하-불합격 리스트 만들기
numbers = [12, 32, 55, 12, 32, 4, 86, 50]
score_list = map(lambda x: "합격" if x>=60 else "불합격" if x<=50 else "대기", numbers)
print(list(score_list))
print(list(map(lambda x: "합격" if x>60 else "대기" if 50<x else "불합격", numbers)))





# 실습04-2
# 람다, 필터 사용해서 jpg파일만 골라 리스트 만들기
files = ["memo.txt", "1.jpg", "32.png", "23.jpg", "223.jpg"]
jpg_list = []
for i in files:
    if "jpg" in i:
        jpg_list.append(i)
print(jpg_list)

print(list(filter(lambda x: x.find(".jpg") != -1, files)))
print(list(filter(lambda x: '.jpg' in x, files)))

# 숙제 - in, .find 사용하지 않고
x = "1.jpg"
print(x[len(x)-4:len(x)+1], " <-")
print(list(filter(lambda x: x[len(x)-4:] == ".jpg", files)))

# 특정 단어가 몇번 들어있는지
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
# jpg
lst = []
for i in range(len(str)-2):
    if str[i] == "j":
        if str[i+1] == "p":
            if str[i+2] == "g":
                lst.append(str[i:i+3])
print(len(lst), " <<<")
# jpg 람다,필터사용
# print(list(filter(lambda )))


# gpjgpj가 있는지 gpjgpjgpj - 1개 (겹치는 것 불가)
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
#                  ^^^^^^







# 리스트 세 개의 곱
lst1 = [1,2,3,4,5]
lst2 = [1,3,5,7,9]
lst3 = [2,4,8]
print(list(map(lambda x,y,z: x*y*z, lst1, lst2, lst3))) #[2, 24, 120]


#1부터 10까지의 제곱 값 중 홀수만 출력해보기
a = list(map (lambda x: x*x, range(1,11)) )
print(list( filter (lambda x: x%2==1, a) ))
print(list( filter (lambda x: x%2==1, map (lambda x: x*x, range(1,11))) ))









