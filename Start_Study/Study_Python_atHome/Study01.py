# x = int(input("x입력: ")) #2
# y = int(input("y입력: ")) #10
#
# print(x+y) #12
# print(x*y) #20
# print(x**y) #1024



# a = "과일"
# b = "사과"
# print(a+b) #과일사과
# print(a*3) #과일과일과일


# word = "Apple Banana"
# print(len(word)) #12
# print(word.replace("Banana", "Orange")) #Apple Orange
# print(word.upper()) #APPLE BANANA
# print(word.lower()) #apple banana
# print(word.replace(" ", "")) #AppleBanana

# n2 = 3.141592
# print("n2 = %09.2f" %n2)


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































